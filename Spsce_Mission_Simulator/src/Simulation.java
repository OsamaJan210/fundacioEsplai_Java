import java.util.ArrayList;
import java.util.Scanner;

public class Simulation {
    public static ArrayList<Mission> missionsList = new ArrayList<>();
    public static ArrayList<SpaceCraft> spaceCraftsList = new ArrayList<>();

    public int pendingMissions() {
        int count = 0;
        for (Mission m : missionsList) {
            if (!m.status) {
                count++;
            }
        }
        return count;
    }

    public int totalSpaceCrafts() {
        return spaceCraftsList.size();
    }

    public boolean isCapable(String experienceName, int experienceValue, SpaceCraft craft, Mission m){
        return switch (experienceName.toLowerCase()) {
            case "technical" -> craft.experience.getTechnicalExperience() >= experienceValue && craft.loadCapacity >= m.getLoad();
            case "strategic" -> craft.experience.getStrategicExperience() >= experienceValue && craft.loadCapacity >= m.getLoad();
            case "scientific" -> craft.experience.getScientificExperience() >= experienceValue && craft.loadCapacity >= m.getLoad();
            default -> false;
        };
    }

    public void updateCraft(String name, int val, SpaceCraft sc){
        switch (name.toLowerCase()){
            case "technical":
                sc.experience.setTechnicalExperience(val);
                sc.setCurrentAutonomy(sc.getCurrentAutonomy() - val);
                break;

            case "scientific":
                sc.experience.setScientificExperience(val);
                sc.setCurrentAutonomy(sc.getCurrentAutonomy() - val);
                break;

            case "strategic":
                sc.experience.setStrategicExperience(val);
                sc.setCurrentAutonomy(sc.getCurrentAutonomy() - val);
                break;

            default:
                break;
        }
    }


    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Simulation simulation = new Simulation();

        String name;
        String type;
        String experience;
        String tempExperienceName;
        int tempExperienceValue;
        int load;
        int duration;
        int priority;
        int maxAutonomy;
        int loadCapacity;
        boolean scientificSensors;

        System.out.println("==Register Space Crafts==");

        for (int i=0; i<5; i++){
            System.out.print("Enter Name : ");
            name = scanner.nextLine();

            System.out.print("Enter Max Autonomy : " );
            maxAutonomy = scanner.nextInt();

            System.out.print("Enter Load Capacity : ");
            loadCapacity = scanner.nextInt();

            System.out.print("Enter Scientific Sensors : ");
            scientificSensors = scanner.nextBoolean();
            scanner.nextLine(); // fix: consume leftover newline


            SpaceCraft newSpaceCraft = new SpaceCraft(name, maxAutonomy, maxAutonomy, loadCapacity, scientificSensors, 0, 0, 0);
            spaceCraftsList.add(newSpaceCraft);
            System.out.println("Space Craft Added Successfully");
        }


        System.out.println("==Register Mission==");

        for (int i=0; i<5; i++){
            System.out.print("Enter Name : ");
            name = scanner.nextLine();

            System.out.print("Enter Type : " );
            type = scanner.nextLine();

            System.out.print("Enter Duration : ");
            duration = scanner.nextInt();

            System.out.print("Enter Priority : ");
            priority = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Enter Load : ");
            load = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Experience : ");
            experience = scanner.nextLine();

            Mission newMission = new Mission(name, load, duration, priority, type, false, experience);
            missionsList.add(newMission);
            System.out.println("Mission Added Successfully");
        }

        int i=1;
        while (true){
            System.out.println("Simulation Cycle " + i++);

            System.out.println("Pending Missions : " + simulation.pendingMissions());
            System.out.println("Space Crafts Available : " + simulation.totalSpaceCrafts());

            for (Mission m: missionsList){
                if(!m.status){

                    String[] parts = m.getRequiredExperience().split(" ");
                    tempExperienceValue = Integer.parseInt(parts[0]);
                    tempExperienceName = parts[1];

                    System.out.println("Evaluating Mission : " + m.getName() + "[Priority : " + m.getPriority() + "]");
                    System.out.println("Requirement : " + m.getLoad() + tempExperienceName + " >= " + tempExperienceValue);

                    for (SpaceCraft sc : spaceCraftsList){
                        if(simulation.isCapable(tempExperienceName, tempExperienceValue, sc, m)){
                            System.out.println(">> Selected Space Craft : " + sc.getName());
                            System.out.println(">> Executing mission...");
                            System.out.println("-Mission Completed Successfully.");
                            System.out.println("-Experience Gained : +" + tempExperienceValue + " " + tempExperienceName);
                            simulation.updateCraft(tempExperienceName, tempExperienceValue, sc);
                            System.out.println("Random Event : none");
                            System.out.println("Remaining Autonomy : " + sc.getCurrentAutonomy());

                            break;
                        }
                    }

                }
            }
            System.out.println("== End Of Cycle ==");
            System.out.println("Autonomy Restore to 100% ");
            System.out.println();

            System.out.println("==Space Craft Stats==");
            for(SpaceCraft sc : spaceCraftsList){
                sc.setCurrentAutonomy(sc.getMaxAutonomy());
                sc.showStats();
            }
            System.out.println();

            System.out.println("Pending Missions");
            for (Mission m : missionsList){
                if(!m.status){
                    System.out.println(m.getName());
                }
            }

            System.out.println("Do you want more Cycles (0, 1) : ");
            int choice = scanner.nextInt();
            if(choice == 0){
                break;
            }
        }
    }
}

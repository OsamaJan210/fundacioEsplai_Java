public class SpaceCraft {

    public String name;
    public int maxAutonomy;
    public int currentAutonomy;
    public int loadCapacity;
    public boolean hasScientificSensors;
    public Experience experience;

    public SpaceCraft(String name, int maxAutonomy, int currentAutonomy, int loadCapacity, boolean hasScientificSensors, int sciEx, int strEx, int techEx) {
        this.name = name;
        this.maxAutonomy = maxAutonomy;
        this.currentAutonomy = currentAutonomy;
        this.loadCapacity = loadCapacity;
        this.hasScientificSensors = hasScientificSensors;
        this.experience = new Experience(techEx, sciEx, strEx);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMaxAutonomy() {
        return maxAutonomy;
    }

    public void setMaxAutonomy(int maxAutonomy) {
        this.maxAutonomy = maxAutonomy;
    }

    public int getCurrentAutonomy() {
        return currentAutonomy;
    }

    public void setCurrentAutonomy(int currentAutonomy) {
        this.currentAutonomy = currentAutonomy;
    }

    public int getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(int loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    public boolean isHasScientificSensors() {
        return hasScientificSensors;
    }

    public void setHasScientificSensors(boolean hasScientificSensors) {
        this.hasScientificSensors = hasScientificSensors;
    }

    public Experience getExperience() {
        return experience;
    }

    public void setExperience(Experience experience) {
        this.experience = experience;
    }

    public int totalExperience(){
        return this.experience.totalExperience();
    }

    public void showStats(){
        System.out.println(this.name +
                ": Total: "+ this.experience.totalExperience() +
                " | Technical: " + this.experience.getTechnicalExperience() +
                " | Scientific: " + this.experience.getScientificExperience() +
                " | Strategic: " + this.experience.getStrategicExperience() );
    }
}

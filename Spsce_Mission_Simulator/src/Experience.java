public class Experience {
    public int technicalExperience;
    public int scientificExperience;
    public int strategicExperience;

    public Experience(int technicalExperience, int scientificExperience, int strategicExperience) {
        this.technicalExperience = technicalExperience;
        this.scientificExperience = scientificExperience;
        this.strategicExperience = strategicExperience;
    }

    public int getTechnicalExperience() {
        return technicalExperience;
    }

    public void setTechnicalExperience(int technicalExperience) {
        this.technicalExperience = technicalExperience;
    }

    public int getScientificExperience() {
        return scientificExperience;
    }

    public void setScientificExperience(int scientificExperience) {
        this.scientificExperience = scientificExperience;
    }

    public int getStrategicExperience() {
        return strategicExperience;
    }

    public void setStrategicExperience(int strategicExperience) {
        this.strategicExperience = strategicExperience;
    }

    public int totalExperience(){
        return this.scientificExperience+this.strategicExperience+this.technicalExperience;
    }
}
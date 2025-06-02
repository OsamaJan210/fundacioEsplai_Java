public class Mission{
    public String name;
    public int duration;
    public int priority;
    public String type;
    public boolean status;
    public String requiredExperience;
    public int load;

    public Mission(String name, int load, int duration, int priority, String type, boolean status, String requiredExperience) {
        this.name = name;
        this.duration = duration;
        this.priority = priority;
        this.type = type;
        this.status = status;
        this.load = load;
        this.requiredExperience = requiredExperience;
    }

    public int getLoad() {
        return load;
    }

    public void setLoad(int load) {
        this.load = load;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getRequiredExperience() {
        return requiredExperience;
    }

    public void setRequiredExperience(String requiredExperience) {
        this.requiredExperience = requiredExperience;
    }
}
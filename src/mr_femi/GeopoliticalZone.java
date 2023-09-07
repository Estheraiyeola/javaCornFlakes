package mr_femi;

public enum GeopoliticalZone {
    NORTH_EAST("Adamawa\t" +
            "Bauchi\t" +
            "Borno\t" +
            "Gombe\t" +
            "Taraba\t" +
            "Yobe\t"),
    NORTH_WEST("Sokoto\t" +
            "Kebbi\t" +
            "Zamfara\t" +
            "Kastina\t" +
            "Kaduna\t" +
            "Kano\t" +
            "Jigawa\t"),
    NORTH_CENTRAL("Benue\t" +
            "Kogi\t" +
            "Kwara\t" +
            "Nasarawa\t" +
            "Niger\t" +
            "Plateau\t"),
    SOUTH_WEST("Ondo\t" +
            "Osun\t" +
            "Oyo\t" +
            "Ekiti\t" +
            "Lagos\t" +
            "Ogun\t"),
    SOUTH_EAST("Abia\t" +
            "Anambra\t" +
            "Ebonyi\t" +
            "Enugu\t" +
            "Imo\t"),
    SOUTH_SOUTH("Akwa_Ibom\t" +
            "Bayelsa\t" +
            "CrossRiver\t" +
            "Delta\t" +
            "Edo\t" +
            "Rivers\t");

    private String state;
    private GeopoliticalZone(String state){
        this.state = state;
    }

    public String returnState(){
        this.state = state;
        return  state;
    }

}

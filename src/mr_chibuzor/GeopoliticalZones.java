package mr_chibuzor;

import java.util.Scanner;

public enum GeopoliticalZones {
    NORTH_CENTRAL("Benue", "FCT", "Kogi", "Kwara", "Nasarawa", "Niger", "Plateau"),
    NORTH_EAST("Adamawa", "Bauchi", "Borno", "Gombe", "Taraba", "Yobe"),
    NORTH_WEST("Kaduna", "Kastina", "Kano", "Kebbi", "Sokoto", "Jigawa", "Zamfara"),
    SOUTH_EAST("Abia", "Anambra", "Ebonyi", "Enungu", "Imo"),
    SOUTH_SOUTH("Akwa-Ibom", "Bayelsa", "Cross-River", "Delta", "Edo", "Rivers"),
    SOUTH_WEST("Ekiti", "Lagos", "Osun", "Ondo", "Ogun", "Oyo");

    private String[] states;
    private static Scanner input = new Scanner(System.in);

    GeopoliticalZones(String... states){
        this.states = states;
    }
    public void setStates(String state){
        
    }
    
    public String[] getStates(){
        return states;
    }
    public static String collectsStateFromUsers(){
        System.out.println("Enter the state you're looking for: ");
        return input.next();
    }
    
    public static GeopoliticalZones getPoliticalZone(String requiredState){
        for (GeopoliticalZones value : values()) {
            GeopoliticalZones state = iterateOverStates(requiredState, value);
            if (state != null) return state;
        }
        return null;
    }

    private static GeopoliticalZones iterateOverStates(String requiredState, GeopoliticalZones value) {
        for (String state : value.states)
            if (state.equalsIgnoreCase(requiredState)) return value;
        return null;
    }

    public static void displayPoliticalZone(){
        String state = collectsStateFromUsers();
        System.out.println(getPoliticalZone(state));
    }


}

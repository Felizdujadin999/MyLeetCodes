package ChapterEight;

public enum GeoPoliticalZones {
    SOUTH_SOUTH(new String[]{"AkwaIbom", "Bayelsa", "CrossRiver", "Delta", "Edo", "Rivers"}),
    SOUTH_WEST(new String[]{"Ekiti", "Lagos", "Osun", "Ondo", "Ogun", "Oyo"}),
    SOUTH_EAST(new String[]{"Abia", "Anambra", "Ebonyi", "Enugu", "Imo"}),
    NORTH_WEST(new String[]{"Kaduna", "Kastina", "Kano", "Kebbi", "Sokoto", "Jigawa", "Zamfara"}),
    NORTH_EAST(new String[]{"Adamawa", "Bauchi", "Borno", "Gombe", "Taraba", "Yobe"}),
    NORTH_CENTRAL(new String[]{"Benue", "FCT", "Kogi", "Kwara", "Nasarawa", "Niger", "Plateau"});
    private String[] state;
    GeoPoliticalZones(String[] zones) {
        this.state = zones;
    }
    public String[] getState() {
        return state;
    }
        public static GeoPoliticalZones zoneFinder(String state){
        GeoPoliticalZones politicalZones = null;
        for (GeoPoliticalZones zones : GeoPoliticalZones.values()) {
            for (String states : zones.getState()) {
                if (state.equalsIgnoreCase(states)) {
                    System.out.println(zones);
                    politicalZones = zones;
                }
            }
        }
        return politicalZones;
    }
}
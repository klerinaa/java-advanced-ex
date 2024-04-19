package enums;

public enum Size {
    SMALL,MEDIUM,LARGE,EXTRALARGE ; //percaktojme elemententet , ME SHKRONJA TE MEDHAJA DHE ME ME PRESJA



    public String getSize(){
        switch (this){
            case SMALL:
                return "Size is SMALL";

            case MEDIUM:
                return "Size is MEDIUM";

            case LARGE:
                return "Size is LARGE";

            case EXTRALARGE:
                return "Size is EXTRALARGE";
            default:return  null;
        }
    }
}

class EnumEx1{
    public static void main(String[] args){
        Direction d1 = Direction.EAST;
        Direction d2 = Direction.valueOf("WEST");
        Direction d3 = Enum.valueOf(Direction.class, "EAST");
        
        System.out.println(d1 + "\n" + d2 + "\n"+ d3);
        
        //==연산자 가능
        System.out.println("d1 == d3 ? " + (d1==d3));
        //equals도 가능
        System.out.println("d1.equals(d3) ? " + d1.equals(d3));
        //compareTo
        System.out.println("d1.compareTo(d3) ? " + d1.compareTo(d3));
        System.out.println("d1.compareTo(d2) ? " + d1.compareTo(d2));
        
        //switch 문 사용 시 enum.CONST 대신 바로 CONST로 접근해야함.
        switch(d1) {
            case EAST: //Direction.EAST라고 하면 오류
                System.out.println("EAST 입니다.");
                break;
            case WEST:
                System.out.println("WEST 입니다.");
            default:
                System.out.println("둘 다 아닙니다.");
        }
        
        Direction[] dArr = Direction.values();
        for (Direction d : dArr){
            System.out.printf("%s의 idx: %d\n", d.name(), d.ordinal());
        }
    }
}

enum Direction { EAST, SOUTH, WEST, NORTH }
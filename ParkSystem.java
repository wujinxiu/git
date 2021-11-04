package Park;

/**
 * @author xiu
 * @create 2021-10-31 19:53
 */
public class ParkSystem implements IParking{
//    车位初始值
    Integer big;
    Integer medium;
    Integer small;
    int [] init=new int[3];
    public static void main(String[] args) {
        ParkSystem parkSystem = new ParkSystem(1,1,2);
        System.out.println(parkSystem.addCar(1));
        System.out.println(parkSystem.addCar(2));
        parkSystem.print();
    }
    public ParkSystem(Integer big, Integer medium, Integer small) {
      init[0]=  this.big = big;
        init[1]=  this.medium = medium;
        init[2]=  this.small = small;
    }
    @Override
    public void print() {
        for (int i = 0; i < init[0]-big; i++) {
            System.out.print(1+" ");
        }
        for (int i = 0; i < init[1]-medium; i++) {
            System.out.print(2+" ");
        }
        for (int i = 0; i < init[2]-small; i++) {
            System.out.print(3+" ");
        }

    }

    @Override
    public boolean addCar(int carType) {

        if (carType==1&&big>0){
            big-=1;
            return true;
        }
        else if (carType==2&&medium>0){
            medium-=1;
            return true;
        }
        else if (carType==2&&small>0){
            small-=1;
            return true;
        }
        return false;
    }
}

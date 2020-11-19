package dataBase;

public class test {
    public static void main(String[] args) {
        ssh SSH = new ssh();
        SSH.makeSSH();
        HitService hitService = new HitService();
        //HitStorageBD hitStorageBD = new HitStorageBD(1, 2, 3, "Y");
        //hitService.saveHit(hitStorageBD);
        HitStorageBD hitStorageBD = hitService.findHit(4);
        System.out.println(hitStorageBD.getId());
    }
}

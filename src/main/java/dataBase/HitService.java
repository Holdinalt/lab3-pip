package dataBase;


import java.util.List;

public class HitService {

    private HitDao hitDao = new HitDao();

    public HitService() {
    }

    public HitStorageBD findHit(int id) {
        return hitDao.findById(id);
    }

    public void saveHit(HitStorageBD hit) {
        hitDao.save(hit);
    }

    public void deleteHit(HitStorageBD hit) {
        hitDao.delete(hit);
    }

    public void updateHit(HitStorageBD hit) {
        hitDao.update(hit);
    }

    public List<HitStorageBD> findAllHits() {
        return hitDao.findAll();
    }

}

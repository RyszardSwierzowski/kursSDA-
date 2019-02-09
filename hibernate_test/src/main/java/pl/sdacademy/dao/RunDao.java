package pl.sdacademy.dao;

import pl.sdacademy.entity.Run;
import java.util.List;

public interface RunDao {
    void save(Run run);
    void delete(Integer id);
    Run getRun(Integer id);
    List<Run> getAll();
}

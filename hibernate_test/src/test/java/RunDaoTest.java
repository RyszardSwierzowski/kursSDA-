import org.junit.Assert;
import org.junit.Test;
import pl.sdacademy.dao.RunDao;
import pl.sdacademy.entity.Run;
import pl.sdacademy.utils.DaoProvider;

import java.util.Date;
import java.util.Random;
import java.util.UUID;

public class RunDaoTest {

    @Test
    public void saveTest() {
        RunDao dao = DaoProvider.getInstance().getRunDao();

        Run run = new Run();
        run.setName(UUID.randomUUID().toString());
        run.setPlace(UUID.randomUUID().toString());
        run.setMembersLimit(new Random().nextInt());
        run.setStartDate(new Date());

        dao.save(run);

        Run test = dao.getRun(run.getId());

        Assert.assertNotNull(test);
        Assert.assertEquals(run.getName(), test.getName());
        Assert.assertEquals(run.getPlace(), test.getPlace());
        Assert.assertEquals(run.getMembersLimit(), test.getMembersLimit());
        Assert.assertEquals(run.getStartDate(), test.getStartDate());
    }

    @Test
    public void deleteTest() {
        //TODO: dokonczyc
    }

    @Test
    public void updateTest() {
        RunDao dao = DaoProvider.getInstance().getRunDao();

        Run run = new Run();
        run.setName(UUID.randomUUID().toString());
        run.setPlace(UUID.randomUUID().toString());
        run.setMembersLimit(new Random().nextInt());
        run.setStartDate(new Date());

        dao.save(run);

        Run toUpdate = dao.getRun(run.getId());
        toUpdate.setName(UUID.randomUUID().toString());
        toUpdate.setPlace(UUID.randomUUID().toString());
        toUpdate.setMembersLimit(new Random().nextInt());
        toUpdate.setStartDate(new Date());
        dao.save(toUpdate);

        Run afterUpdate = dao.getRun(run.getId());

        Assert.assertNotNull(afterUpdate);
        Assert.assertEquals(toUpdate.getName(), afterUpdate.getName());
        Assert.assertEquals(toUpdate.getPlace(), afterUpdate.getPlace());
        Assert.assertEquals(toUpdate.getMembersLimit(), afterUpdate.getMembersLimit());
        Assert.assertEquals(toUpdate.getStartDate(), afterUpdate.getStartDate());
    }
}

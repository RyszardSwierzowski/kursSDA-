package pl.sdacademy.rest.endPoints;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.restlet.data.Status;
import org.restlet.representation.Representation;
import org.restlet.resource.Delete;
import org.restlet.resource.Get;
import org.restlet.resource.Post;
import org.restlet.resource.ServerResource;
import pl.sdacademy.entity.Run;
import pl.sdacademy.utils.DaoProvider;

import java.util.List;

public class RunEndPoint extends ServerResource {

    @Get
    public String methodGet() {


        ObjectMapper mapper = new ObjectMapper();
        try {
            String runIdText = getAttribute("runId");
            if (runIdText != null && runIdText.length() > 0) {
                Integer runId = Integer.valueOf(runIdText);
                Run run = DaoProvider
                        .getInstance()
                        .getRunDao()
                        .getRun(runId);

                String json = mapper.writeValueAsString(run);
                return json;
            } else {
                List<Run> runs = DaoProvider
                        .getInstance()
                        .getRunDao()
                        .getAll();
                String json = mapper.writeValueAsString(runs);
                return json;

            }


        } catch (JsonProcessingException e) {
            e.printStackTrace();

            getResponse().setStatus(Status.SERVER_ERROR_INTERNAL);
            return e.getMessage();

        }
        //return "<h1> Error </h1>";
    }

    @Delete
    public void deleteMessage() {
        String idText = getQueryValue("id");
        if (idText != null && idText.length() > 0) {
            Integer id = Integer.valueOf(idText);
            DaoProvider
                    .getInstance()
                    .getRunDao()
                    .delete(id);
        } else {
            getResponse().setStatus(Status.CLIENT_ERROR_BAD_REQUEST);
        }
    }

    @Post
    public String methodPost(Representation entity)
    {
        try
        {
            String body = entity.getText();
            ObjectMapper mapper = new ObjectMapper();
            Run run = mapper.readValue(body, Run.class);

            DaoProvider.getInstance().getRunDao().save(run);

            return run.getId().toString();
        }
        catch (Exception e)
        {
            e.printStackTrace();
            getResponse().setStatus(Status.SERVER_ERROR_INTERNAL);
            return e.getMessage();
        }
    }

}

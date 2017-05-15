package client.sdk;

import com.amazonaws.opensdk.config.ConnectionConfiguration;
import org.junit.Assert;
import org.junit.Test;
import webrobotapi.model.*;
import webrobotapi.webrobotapi;
import junit.framework.*;
/**
 * Created by roger on 01/05/17.
 */
public class tests
{
    @Test
    public void testProjects()
    {
        webrobotapi client = webrobotapi.builder("apikey","http://localhost:9998/")
                .connectionConfiguration(
                        new ConnectionConfiguration()
                                .maxConnections(100)
                                .connectionMaxIdleMillis(1000)
                )
                .build();
        Create_projectRequest createProjectRequest = new Create_projectRequest();
        BotProject botProject = new BotProject();
        botProject.setName("testProject");
        botProject.setDescription("testProject");
        createProjectRequest.setBotProject(botProject);
        Create_projectResult createProjectResult = client.create_project(createProjectRequest);
        BotProject botProjectResult = createProjectResult.getBotProject();
        Assert.assertEquals(botProject.getId() + "-" + botProject.getApikey() + "-" + botProject.getCreatedTime()
                + "-" + botProject.getDescription(),botProjectResult.getId() + "-" + botProjectResult.getApikey() + "-" + botProjectResult.getCreatedTime()
                + "-" + botProjectResult.getDescription());
        Get_all_projectsRequest getProjects = new Get_all_projectsRequest();
        Get_all_projectsResult result = client.get_all_projects(getProjects);
    }
}

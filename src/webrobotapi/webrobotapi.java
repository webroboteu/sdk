/**
null
*/
package webrobotapi;

import javax.annotation.Generated;

import com.amazonaws.ClientConfiguration;
import webrobotapi.model.*;

/**
 * Interface for accessing webrobotapi.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface webrobotapi {

    /**
     @param status_build_xpath_modelRequest
     @return Result of the status_build_xpath_model operation returned by the service.
     @throws InternalServerErrorException
     @sample webrobotapi.status_build_xpath_model
     @see <a href="http://docs.aws.amazon.com/goto/WebAPI/90ngiz4uj1-1.0.0/status_build_xpath_model" target="_top">AWS API Documentation</a>*/
    Status_build_xpath_modelResult status_build_xpath_model(Status_build_xpath_modelRequest status_build_xpath_modelRequest);
    /**
     @param statusjobRequest
     @return Result of the statusjob operation returned by the service.
     @throws BadRequestException
     @throws InternalServerErrorException
     @sample webrobotapi.statusjob
     @see <a href="http://docs.aws.amazon.com/goto/WebAPI/90ngiz4uj1-1.0.0/statusjob" target="_top">AWS API Documentation</a>*/
    StatusjobResult statusjob(StatusjobRequest statusjobRequest);
    /**
     @param stop_build_xpath_modelRequest
     @return Result of the stop_build_xpath_model operation returned by the service.
     @throws InternalServerErrorException
     @sample webrobotapi.stop_build_xpath_model
     @see <a href="http://docs.aws.amazon.com/goto/WebAPI/90ngiz4uj1-1.0.0/stop_build_xpath_model" target="_top">AWS API Documentation</a>*/
    Stop_build_xpath_modelResult stop_build_xpath_model(Stop_build_xpath_modelRequest stop_build_xpath_modelRequest);
    /**
     @param stopjobRequest
     @return Result of the stopjob operation returned by the service.
     @throws BadRequestException
     @throws InternalServerErrorException
     @sample webrobotapi.stopjob
     @see <a href="http://docs.aws.amazon.com/goto/WebAPI/90ngiz4uj1-1.0.0/stopjob" target="_top">AWS API Documentation</a>*/
    StopjobResult stopjob(StopjobRequest stopjobRequest);
    /**
    /**
     @param build_xpath_modelRequest
     @return Result of the build_xpath_model operation returned by the service.
     @throws InternalServerErrorException
     @sample webrobotapi.build_xpath_model
     @see <a href="http://docs.aws.amazon.com/goto/WebAPI/90ngiz4uj1-1.0.0/build_xpath_model" target="_top">AWS API Documentation</a>*/
    Build_xpath_modelResult build_xpath_model(Build_xpath_modelRequest build_xpath_modelRequest);
/**
@param create_attributeRequest 
@return Result of the create_attribute operation returned by the service.
@throws InternalServerErrorException 
@sample webrobotapi.create_attribute
@see <a href="http://docs.aws.amazon.com/goto/WebAPI/xda6xr3yi1-1.0.0/create_attribute" target="_top">AWS API Documentation</a>*/
Create_attributeResult create_attribute(Create_attributeRequest create_attributeRequest);
/**
@param create_botRequest 
@return Result of the create_bot operation returned by the service.
@throws BadRequestException 
@throws InternalServerErrorException 
@sample webrobotapi.create_bot
@see <a href="http://docs.aws.amazon.com/goto/WebAPI/xda6xr3yi1-1.0.0/create_bot" target="_top">AWS API Documentation</a>*/
Create_botResult create_bot(Create_botRequest create_botRequest);

    /**
     @param get_all_botsRequest
     @return Result of the get_all_bots operation returned by the service.
     @throws BadRequestException
     @throws InternalServerErrorException
     @sample webrobotapi.get_all_bots
     @see <a href="http://docs.aws.amazon.com/goto/WebAPI/90ngiz4uj1-1.0.0/get_all_bots" target="_top">AWS API Documentation</a>*/
    Get_all_botsResult get_all_bots(Get_all_botsRequest get_all_botsRequest);

/**
@param create_conceptRequest 
@return Result of the create_concept operation returned by the service.
@throws InternalServerErrorException 
@sample webrobotapi.create_concept
@see <a href="http://docs.aws.amazon.com/goto/WebAPI/xda6xr3yi1-1.0.0/create_concept" target="_top">AWS API Documentation</a>*/
Create_conceptResult create_concept(Create_conceptRequest create_conceptRequest);
/**
@param create_jobRequest 
@return Result of the create_job operation returned by the service.
@throws BadRequestException 
@throws InternalServerErrorException 
@sample webrobotapi.create_job
@see <a href="http://docs.aws.amazon.com/goto/WebAPI/xda6xr3yi1-1.0.0/create_job" target="_top">AWS API Documentation</a>*/
Create_jobResult create_job(Create_jobRequest create_jobRequest);
/**
@param create_pageRequest 
@return Result of the create_page operation returned by the service.
@throws InternalServerErrorException 
@sample webrobotapi.create_page
@see <a href="http://docs.aws.amazon.com/goto/WebAPI/xda6xr3yi1-1.0.0/create_page" target="_top">AWS API Documentation</a>*/
Create_pageResult create_page(Create_pageRequest create_pageRequest);
/**
@param create_projectRequest 
@return Result of the create_project operation returned by the service.
@throws BadRequestException 
@throws InternalServerErrorException 
@sample webrobotapi.create_project
@see <a href="http://docs.aws.amazon.com/goto/WebAPI/xda6xr3yi1-1.0.0/create_project" target="_top">AWS API Documentation</a>*/
Create_projectResult create_project(Create_projectRequest create_projectRequest);
/**
@param delete_attributeRequest 
@return Result of the delete_attribute operation returned by the service.
@throws InternalServerErrorException 
@sample webrobotapi.delete_attribute
@see <a href="http://docs.aws.amazon.com/goto/WebAPI/xda6xr3yi1-1.0.0/delete_attribute" target="_top">AWS API Documentation</a>*/
Delete_attributeResult delete_attribute(Delete_attributeRequest delete_attributeRequest);
/**
@param delete_bot_from_idRequest 
@return Result of the delete_bot_from_id operation returned by the service.
@throws InternalServerErrorException 
@sample webrobotapi.delete_bot_from_id
@see <a href="http://docs.aws.amazon.com/goto/WebAPI/xda6xr3yi1-1.0.0/delete_bot_from_id" target="_top">AWS API Documentation</a>*/
Delete_bot_from_idResult delete_bot_from_id(Delete_bot_from_idRequest delete_bot_from_idRequest);
/**
@param delete_conceptRequest 
@return Result of the delete_concept operation returned by the service.
@throws InternalServerErrorException 
@sample webrobotapi.delete_concept
@see <a href="http://docs.aws.amazon.com/goto/WebAPI/xda6xr3yi1-1.0.0/delete_concept" target="_top">AWS API Documentation</a>*/
Delete_conceptResult delete_concept(Delete_conceptRequest delete_conceptRequest);
/**
@param delete_datasetRequest 
@return Result of the delete_dataset operation returned by the service.
@throws InternalServerErrorException 
@sample webrobotapi.delete_dataset
@see <a href="http://docs.aws.amazon.com/goto/WebAPI/xda6xr3yi1-1.0.0/delete_dataset" target="_top">AWS API Documentation</a>*/
Delete_datasetResult delete_dataset(Delete_datasetRequest delete_datasetRequest);
/**
@param delete_datasetset_versionRequest 
@return Result of the delete_datasetset_version operation returned by the service.
@throws InternalServerErrorException 
@sample webrobotapi.delete_datasetset_version
@see <a href="http://docs.aws.amazon.com/goto/WebAPI/xda6xr3yi1-1.0.0/delete_datasetset_version" target="_top">AWS API Documentation</a>*/
Delete_datasetset_versionResult delete_datasetset_version(Delete_datasetset_versionRequest delete_datasetset_versionRequest);
/**
@param delete_jobRequest 
@return Result of the delete_job operation returned by the service.
@throws InternalServerErrorException 
@sample webrobotapi.delete_job
@see <a href="http://docs.aws.amazon.com/goto/WebAPI/xda6xr3yi1-1.0.0/delete_job" target="_top">AWS API Documentation</a>*/
Delete_jobResult delete_job(Delete_jobRequest delete_jobRequest);
/**
@param delete_pageRequest 
@return Result of the delete_page operation returned by the service.
@throws InternalServerErrorException 
@sample webrobotapi.delete_page
@see <a href="http://docs.aws.amazon.com/goto/WebAPI/xda6xr3yi1-1.0.0/delete_page" target="_top">AWS API Documentation</a>*/
Delete_pageResult delete_page(Delete_pageRequest delete_pageRequest);
/**
@param deleteprojectbyidRequest 
@return Result of the deleteprojectbyid operation returned by the service.
@throws BadRequestException 
@throws InternalServerErrorException 
@sample webrobotapi.deleteprojectbyid
@see <a href="http://docs.aws.amazon.com/goto/WebAPI/xda6xr3yi1-1.0.0/deleteprojectbyid" target="_top">AWS API Documentation</a>*/
DeleteprojectbyidResult deleteprojectbyid(DeleteprojectbyidRequest deleteprojectbyidRequest);
/**
@param get all conceptsRequest 
@return Result of the get all concepts operation returned by the service.
@throws InternalServerErrorException 
@sample webrobotapi.get all concepts
@see <a href="http://docs.aws.amazon.com/goto/WebAPI/xda6xr3yi1-1.0.0/get all concepts" target="_top">AWS API Documentation</a>*/
Get_all_conceptsResult get_all_concepts(Get_all_conceptsRequest conceptRequest);
/**
@param get_all_attributesRequest 
@return Result of the get_all_attributes operation returned by the service.
@throws BadRequestException 
@throws InternalServerErrorException 
@sample webrobotapi.get_all_attributes
@see <a href="http://docs.aws.amazon.com/goto/WebAPI/xda6xr3yi1-1.0.0/get_all_attributes" target="_top">AWS API Documentation</a>*/
Get_all_attributesResult get_all_attributes(Get_all_attributesRequest get_all_attributesRequest);
/**
@param get_all_datasetRequest 
@return Result of the get_all_dataset operation returned by the service.
@throws InternalServerErrorException 
@sample webrobotapi.get_all_dataset
@see <a href="http://docs.aws.amazon.com/goto/WebAPI/xda6xr3yi1-1.0.0/get_all_dataset" target="_top">AWS API Documentation</a>*/
Get_all_datasetResult get_all_dataset(Get_all_datasetRequest get_all_datasetRequest);
/**
@param get_all_dataset_versionRequest 
@return Result of the get_all_dataset_version operation returned by the service.
@throws InternalServerErrorException 
@sample webrobotapi.get_all_dataset_version
@see <a href="http://docs.aws.amazon.com/goto/WebAPI/xda6xr3yi1-1.0.0/get_all_dataset_version" target="_top">AWS API Documentation</a>*/
Get_all_dataset_versionResult get_all_dataset_version(Get_all_dataset_versionRequest get_all_dataset_versionRequest);
/**
@param get_all_pagesRequest 
@return Result of the get_all_pages operation returned by the service.
@throws InternalServerErrorException 
@sample webrobotapi.get_all_pages
@see <a href="http://docs.aws.amazon.com/goto/WebAPI/xda6xr3yi1-1.0.0/get_all_pages" target="_top">AWS API Documentation</a>*/
Get_all_pagesResult get_all_pages(Get_all_pagesRequest get_all_pagesRequest);
/**
@param get_all_projectsRequest 
@return Result of the get_all_projects operation returned by the service.
@throws BadRequestException 
@throws InternalServerErrorException 
@sample webrobotapi.get_all_projects
@see <a href="http://docs.aws.amazon.com/goto/WebAPI/xda6xr3yi1-1.0.0/get_all_projects" target="_top">AWS API Documentation</a>*/
Get_all_projectsResult get_all_projects(Get_all_projectsRequest get_all_projectsRequest);
/**
@param get_all_versionsetRequest 
@return Result of the get_all_versionset operation returned by the service.
@throws InternalServerErrorException 
@sample webrobotapi.get_all_versionset
@see <a href="http://docs.aws.amazon.com/goto/WebAPI/xda6xr3yi1-1.0.0/get_all_versionset" target="_top">AWS API Documentation</a>*/
Get_all_versionsetResult get_all_versionset(Get_all_versionsetRequest get_all_versionsetRequest);
/**
@param get_attributeRequest 
@return Result of the get_attribute operation returned by the service.
@throws InternalServerErrorException 
@sample webrobotapi.get_attribute
@see <a href="http://docs.aws.amazon.com/goto/WebAPI/xda6xr3yi1-1.0.0/get_attribute" target="_top">AWS API Documentation</a>*/
Get_attributeResult get_attribute(Get_attributeRequest get_attributeRequest);
/**
@param get_bot_from_idRequest 
@return Result of the get_bot_from_id operation returned by the service.
@throws InternalServerErrorException 
@sample webrobotapi.get_bot_from_id
@see <a href="http://docs.aws.amazon.com/goto/WebAPI/xda6xr3yi1-1.0.0/get_bot_from_id" target="_top">AWS API Documentation</a>*/
Get_bot_from_idResult get_bot_from_id(Get_bot_from_idRequest get_bot_from_idRequest);
/**
@param get_bot_from_nameRequest 
@return Result of the get_bot_from_name operation returned by the service.
@throws BadRequestException 
@throws InternalServerErrorException 
@sample webrobotapi.get_bot_from_name
@see <a href="http://docs.aws.amazon.com/goto/WebAPI/xda6xr3yi1-1.0.0/get_bot_from_name" target="_top">AWS API Documentation</a>*/
Get_bot_from_nameResult get_bot_from_name(Get_bot_from_nameRequest get_bot_from_nameRequest);
/**
@param get_conceptRequest 
@return Result of the get_concept operation returned by the service.
@throws BadRequestException 
@throws InternalServerErrorException 
@sample webrobotapi.get_concept
@see <a href="http://docs.aws.amazon.com/goto/WebAPI/xda6xr3yi1-1.0.0/get_concept" target="_top">AWS API Documentation</a>*/
Get_conceptResult get_concept(Get_conceptRequest get_conceptRequest);
/**
@param get_datasetRequest 
@return Result of the get_dataset operation returned by the service.
@throws InternalServerErrorException 
@sample webrobotapi.get_dataset
@see <a href="http://docs.aws.amazon.com/goto/WebAPI/xda6xr3yi1-1.0.0/get_dataset" target="_top">AWS API Documentation</a>*/
Get_datasetResult get_dataset(Get_datasetRequest get_datasetRequest);
/**
@param get_dataset_datasetRequest 
@return Result of the get_dataset_dataset operation returned by the service.
@throws InternalServerErrorException 
@sample webrobotapi.get_dataset_dataset
@see <a href="http://docs.aws.amazon.com/goto/WebAPI/xda6xr3yi1-1.0.0/get_dataset_dataset" target="_top">AWS API Documentation</a>*/
Get_dataset_datasetResult get_dataset_dataset(Get_dataset_datasetRequest get_dataset_datasetRequest);
/**
@param get_dataset_inputRequest 
@return Result of the get_dataset_input operation returned by the service.
@throws InternalServerErrorException 
@sample webrobotapi.get_dataset_input
@see <a href="http://docs.aws.amazon.com/goto/WebAPI/xda6xr3yi1-1.0.0/get_dataset_input" target="_top">AWS API Documentation</a>*/
Get_dataset_inputResult get_dataset_input(Get_dataset_inputRequest get_dataset_inputRequest);
/**
@param get_dataset_input_paginationRequest 
@return Result of the get_dataset_input_pagination operation returned by the service.
@throws InternalServerErrorException 
@sample webrobotapi.get_dataset_input_pagination
@see <a href="http://docs.aws.amazon.com/goto/WebAPI/xda6xr3yi1-1.0.0/get_dataset_input_pagination" target="_top">AWS API Documentation</a>*/
Get_dataset_input_paginationResult get_dataset_input_pagination(Get_dataset_input_paginationRequest get_dataset_input_paginationRequest);
/**
@param get_dataset_outputRequest 
@return Result of the get_dataset_output operation returned by the service.
@throws BadRequestException 
@throws InternalServerErrorException 
@sample webrobotapi.get_dataset_output
@see <a href="http://docs.aws.amazon.com/goto/WebAPI/xda6xr3yi1-1.0.0/get_dataset_output" target="_top">AWS API Documentation</a>*/
Get_dataset_outputResult get_dataset_output(Get_dataset_outputRequest get_dataset_outputRequest);
/**
@param get_dataset_output_paginationRequest 
@return Result of the get_dataset_output_pagination operation returned by the service.
@throws BadRequestException 
@throws InternalServerErrorException 
@sample webrobotapi.get_dataset_output_pagination
@see <a href="http://docs.aws.amazon.com/goto/WebAPI/xda6xr3yi1-1.0.0/get_dataset_output_pagination" target="_top">AWS API Documentation</a>*/
Get_dataset_output_paginationResult get_dataset_output_pagination(Get_dataset_output_paginationRequest get_dataset_output_paginationRequest);
/**
@param get_dataset_paginationRequest 
@return Result of the get_dataset_pagination operation returned by the service.
@throws InternalServerErrorException 
@sample webrobotapi.get_dataset_pagination
@see <a href="http://docs.aws.amazon.com/goto/WebAPI/xda6xr3yi1-1.0.0/get_dataset_pagination" target="_top">AWS API Documentation</a>*/
Get_dataset_paginationResult get_dataset_pagination(Get_dataset_paginationRequest get_dataset_paginationRequest);
/**
@param get_dataset_statusRequest 
@return Result of the get_dataset_status operation returned by the service.
@throws InternalServerErrorException 
@sample webrobotapi.get_dataset_status
@see <a href="http://docs.aws.amazon.com/goto/WebAPI/xda6xr3yi1-1.0.0/get_dataset_status" target="_top">AWS API Documentation</a>*/
Get_dataset_statusResult get_dataset_status(Get_dataset_statusRequest get_dataset_statusRequest);
/**
@param get_job_by_idRequest 
@return Result of the get_job_by_id operation returned by the service.
@throws BadRequestException 
@throws InternalServerErrorException 
@sample webrobotapi.get_job_by_id
@see <a href="http://docs.aws.amazon.com/goto/WebAPI/xda6xr3yi1-1.0.0/get_job_by_id" target="_top">AWS API Documentation</a>*/
Get_job_by_idResult get_job_by_id(Get_job_by_idRequest get_job_by_idRequest);
/**
@param get_pageRequest 
@return Result of the get_page operation returned by the service.
@throws BadRequestException 
@throws InternalServerErrorException 
@sample webrobotapi.get_page
@see <a href="http://docs.aws.amazon.com/goto/WebAPI/xda6xr3yi1-1.0.0/get_page" target="_top">AWS API Documentation</a>*/
Get_pageResult get_page(Get_pageRequest get_pageRequest);
/**
@param get_project_by_idRequest 
@return Result of the get_project_by_id operation returned by the service.
@throws BadRequestException 
@throws InternalServerErrorException 
@sample webrobotapi.get_project_by_id
@see <a href="http://docs.aws.amazon.com/goto/WebAPI/xda6xr3yi1-1.0.0/get_project_by_id" target="_top">AWS API Documentation</a>*/
Get_project_by_idResult get_project_by_id(Get_project_by_idRequest get_project_by_idRequest);
/**
@param get_project_by_nameRequest 
@return Result of the get_project_by_name operation returned by the service.
@throws BadRequestException 
@throws InternalServerErrorException 
@sample webrobotapi.get_project_by_name
@see <a href="http://docs.aws.amazon.com/goto/WebAPI/xda6xr3yi1-1.0.0/get_project_by_name" target="_top">AWS API Documentation</a>*/
Get_project_by_nameResult get_project_by_name(Get_project_by_nameRequest get_project_by_nameRequest);
/**
@param get_version_setRequest 
@return Result of the get_version_set operation returned by the service.
@throws InternalServerErrorException 
@sample webrobotapi.get_version_set
@see <a href="http://docs.aws.amazon.com/goto/WebAPI/xda6xr3yi1-1.0.0/get_version_set" target="_top">AWS API Documentation</a>*/
Get_version_setResult get_version_set(Get_version_setRequest get_version_setRequest);
/**
@param get_version_set_from_versionRequest 
@return Result of the get_version_set_from_version operation returned by the service.
@throws InternalServerErrorException 
@sample webrobotapi.get_version_set_from_version
@see <a href="http://docs.aws.amazon.com/goto/WebAPI/xda6xr3yi1-1.0.0/get_version_set_from_version" target="_top">AWS API Documentation</a>*/
Get_version_set_from_versionResult get_version_set_from_version(Get_version_set_from_versionRequest get_version_set_from_versionRequest);
/**
@param listing_jobsRequest 
@return Result of the listing_jobs operation returned by the service.
@throws BadRequestException 
@throws InternalServerErrorException 
@sample webrobotapi.listing_jobs
@see <a href="http://docs.aws.amazon.com/goto/WebAPI/xda6xr3yi1-1.0.0/listing_jobs" target="_top">AWS API Documentation</a>*/
Listing_jobsResult listing_jobs(Listing_jobsRequest listing_jobsRequest);
/**
@param startjobRequest 
@return Result of the startjob operation returned by the service.
@throws BadRequestException 
@throws InternalServerErrorException 
@sample webrobotapi.startjob
@see <a href="http://docs.aws.amazon.com/goto/WebAPI/xda6xr3yi1-1.0.0/startjob" target="_top">AWS API Documentation</a>*/
StartjobResult startjob(StartjobRequest startjobRequest);
/**
@param update_attributeRequest 
@return Result of the update_attribute operation returned by the service.
@throws InternalServerErrorException 
@sample webrobotapi.update_attribute
@see <a href="http://docs.aws.amazon.com/goto/WebAPI/xda6xr3yi1-1.0.0/update_attribute" target="_top">AWS API Documentation</a>*/
Update_attributeResult update_attribute(Update_attributeRequest update_attributeRequest);
/**
@param update_botRequest 
@return Result of the update_bot operation returned by the service.
@throws BadRequestException 
@throws InternalServerErrorException 
@sample webrobotapi.update_bot
@see <a href="http://docs.aws.amazon.com/goto/WebAPI/xda6xr3yi1-1.0.0/update_bot" target="_top">AWS API Documentation</a>*/
Update_botResult update_bot(Update_botRequest update_botRequest);
/**
@param update_conceptRequest 
@return Result of the update_concept operation returned by the service.
@throws InternalServerErrorException 
@sample webrobotapi.update_concept
@see <a href="http://docs.aws.amazon.com/goto/WebAPI/xda6xr3yi1-1.0.0/update_concept" target="_top">AWS API Documentation</a>*/
Update_conceptResult update_concept(Update_conceptRequest update_conceptRequest);
/**
@param update_pageRequest 
@return Result of the update_page operation returned by the service.
@throws InternalServerErrorException 
@sample webrobotapi.update_page
@see <a href="http://docs.aws.amazon.com/goto/WebAPI/xda6xr3yi1-1.0.0/update_page" target="_top">AWS API Documentation</a>*/
Update_pageResult update_page(Update_pageRequest update_pageRequest);
/**
@param upload_datasetRequest 
@return Result of the upload_dataset operation returned by the service.
@throws InternalServerErrorException 
@sample webrobotapi.upload_dataset
@see <a href="http://docs.aws.amazon.com/goto/WebAPI/xda6xr3yi1-1.0.0/upload_dataset" target="_top">AWS API Documentation</a>*/
Upload_datasetResult upload_dataset(Upload_datasetRequest upload_datasetRequest);


/**
@param uplod_datasetRequest 
@return Result of the uplod_dataset operation returned by the service.
@throws InternalServerErrorException 
@sample webrobotapi.uplod_dataset
@see <a href="http://docs.aws.amazon.com/goto/WebAPI/xda6xr3yi1-1.0.0/uplod_dataset" target="_top">AWS API Documentation</a>*/
Uplod_datasetResult uplod_dataset(Uplod_datasetRequest uplod_datasetRequest);

    /**
    * @return Create new instance of builder with all defaults set.
    */
    public static webrobotapiClientBuilder builder(String apikey,String endpoint) {
      return new webrobotapiClientBuilder(apikey,endpoint);
    }

    /**
     * Shuts down this client object, releasing any resources that might be held
     * open. This is an optional method, and callers are not expected to call
     * it, but can if they want to explicitly release any open resources. Once a
     * client has been shutdown, it should not be used to make any more
     * requests.
     */
    void shutdown();

}

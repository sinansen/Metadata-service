/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package MetadataCore;

/**
 *
 * @author ivano
 */
public class MetadataConstants {
    
    // <editor-fold desc="Constants">
    public static String sLocationSaveAlert = "D:\\Alert onlogija\\alert5.owl";
    public static String sLocationLoadAlert = "file:D:/Alert onlogija/alert5.owl";
    public static String sLocationSaveAlertIts = "D:\\Alert onlogija\\alert_its.owl";
    public static String sLocationLoadAlertIts = "file:D:/Alert onlogija/alert_its.owl";
    public static String sLocationSaveAlertScm = "D:\\Alert onlogija\\alert_scm.owl";
    public static String sLocationLoadAlertScm = "file:D:/Alert onlogija/alert_scm.owl";
    
    //public static String sLocationSave = "\\\\hpserver\\Aktuelni projekti\\ALERT\\Kod\\ontology\\alert5.owl";
    public static String sLocationLoad = "file://hpserver/Aktuelni projekti/ALERT/Kod/ontology/alert5.owl";
    public static String sLocationSaveLoc = "D:\\Sasa.Stojanovic\\Alert\\Ontologies\\alert5.owl";
    public static String sLocationLoadLoc = "file:D:\\Sasa.Stojanovic\\Alert\\Ontologies\\alert5.owl";
    
    public static String sOWLrdf = "http://www.w3.org/1999/02/22-rdf-syntax-ns#";
       
    public static String c_http = "http://";
    
    // <editor-fold desc="Event types">
    public static String c_ET_issue_requestNew = "Metadata.issue.requestNew";
    public static String c_ET_issue_requestUpdate = "Metadata.issue.requestUpdate";
    public static String c_ET_issue_replyNewUpdate = "Metadata.issue.replyNewUpdate";
    public static String c_ET_person_requestNew = "Metadata.person.requestNew";
    public static String c_ET_person_requestUpdate = "Metadata.person.requestUpdate";
    public static String c_ET_person_replyNewUpdate = "Metadata.person.replyNewUpdate";
    public static String c_ET_commit_requestNew = "Metadata.commit.requestNew";
    public static String c_ET_commit_replyNew = "Metadata.commit.replyNew";
    public static String c_ET_APICall_request = "Metadata.APICall.request";
    public static String c_ET_APICall_reply = "Metadata.APICall.reply";
    public static String c_ET_member_request = "Metadata.member.request";
    public static String c_ET_member_reply = "Metadata.member.reply";
    public static String c_ET_issue_requestAnnotation = "Metadata.issue.requestAnnotation";
    public static String c_ET_comment_requestAnnotation = "Metadata.comment.requestAnnotation";
    public static String c_ET_commit_requestAnnotation = "Metadata.commit.requestAnnotation";
    public static String c_ET_forumPost_requestAnnotation = "Metadata.forumPost.requestAnnotation";
    public static String c_ET_mail_requestAnnotation = "Metadata.mail.requestAnnotation";
    public static String c_ET_wikiPost_requestAnnotation = "Metadata.wikiPost.requestAnnotation";

    // </editor-fold>
       
    // <editor-fold desc="XML elements">
    public static String c_XMLE_Id = "Id";
    public static String c_XMLE_Uri = "Uri";
    public static String c_XMLE_event = "event";
    public static String c_XMLE_head = "head";
    public static String c_XMLE_sender = "sender";
    public static String c_XMLE_timestamp = "timestamp";
    public static String c_XMLE_sequencenumber = "sequencenumber";
    public static String c_XMLE_startTime = "startTime";
    public static String c_XMLE_endTime = "endTime";
    public static String c_XMLE_eventName = "eventName";
    public static String c_XMLE_eventId = "eventId";
    public static String c_XMLE_eventType = "eventType";
    public static String c_XMLE_sentby = "sentby";
    
    public static String c_XMLE_keui = "keui";
    public static String c_XMLE_mdservice = "mdservice";
    public static String c_XMLE_rawTextualData = "rawTextualData";
    public static String c_XMLE_relatedOntologyRef = "relatedOntologyRef";
    public static String c_XMLE_content = "content";
    
    public static String c_XMLE_ontoProperty = "onto:property";
    public static String c_XMLE_name = "name";
    public static String c_XMLE_typeOf = "typeOf";
    public static String c_XMLE_value = "value";
    public static String c_XMLE_class = "class";
    public static String c_XMLE_property = "property";
    
    public static String c_XMLE_payload = "payload";
    public static String c_XMLE_meta = "meta";
    public static String c_XMLE_eventData = "eventData";
    
    public static String c_XMLE_refersToRequest = "refersToRequest";
    public static String c_XMLE_requestEventId = "requestEventId";
    public static String c_XMLE_responseData = "responseData";
    public static String c_XMLE_item = "item";
    public static String c_XMLE_isRelatedTo = "isRelatedTo";
       
    public static String c_XMLE_StringType = "http://www.w3.org/TR/xmlschema-2/#string";
    
    public static String c_XMLE_BugType = "http://www.w3.org/1999/02/22-rdf-syntax-ns#Bug";
    
    //public static String c_XMLE_NewBugEvent_hasCommiter = "hasCommiter";
    //public static String c_XMLE_NewBugEvent_isRelatedTo = "isRelatedTo";
    //public static String c_XMLE_NewBugEvent_hasID = "hasID";
    //public static String c_XMLE_NewBugEvent_hasName = "hasName";
    //public static String c_XMLE_NewBugEvent_hasStatus = "hasStatus";
    //public static String c_XMLE_NewBugEvent_hasDescription = "hasDescription";
    //public static String c_XMLE_NewBugEvent_isAbout = "isAbout";
    //public static String c_XMLE_NewBugEvent_hasImportance = "hasImportance";
    //public static String c_XMLE_NewBugEvent_hasSeverity = "hasSeverity";
    
    public static String c_XMLE_Removed = "Removed";
    
    public static String c_XMLE_issue = "issue";
    public static String c_XMLE_issueAuthor = "issueAuthor";
    public static String c_XMLE_issueStatus = "issueStatus";
    public static String c_XMLE_issueResolution = "issueResolution";
    public static String c_XMLE_issueDescription = "issueDescription";
    public static String c_XMLE_issueKeyword = "issueKeyword";
    public static String c_XMLE_issueNumber = "issueNumber";
    public static String c_XMLE_issueProduct = "issueProduct";
    public static String c_XMLE_product = "product";
    public static String c_XMLE_productComponent = "productComponent";
    public static String c_XMLE_productVersion = "productVersion";
    public static String c_XMLE_issueComputerSystem = "issueComputerSystem";
    public static String c_XMLE_computerSystem = "computerSystem";
    public static String c_XMLE_computerSystemPlatform = "computerSystemPlatform";
    public static String c_XMLE_computerSystemOS = "computerSystemOS";
    public static String c_XMLE_issuePriority = "issuePriority";
    public static String c_XMLE_issueSeverity = "issueSeverity";
    public static String c_XMLE_issueAssignedTo = "issueAssignedTo";
    public static String c_XMLE_issueCCPerson = "issueCCPerson";
    public static String c_XMLE_issueUrl = "issueUrl";
    public static String c_XMLE_issueDependsOn = "issueDependsOn";
    public static String c_XMLE_issueBlocks = "issueBlocks";
    public static String c_XMLE_issueDuplicateOf = "issueDuplicateOf";
    public static String c_XMLE_issueMergedInto = "issueMergedInto";
    public static String c_XMLE_issueDateOpened = "issueDateOpened";
    public static String c_XMLE_issueLastModified = "issueLastModified";
    public static String c_XMLE_issueMilestone = "issueMilestone";
    public static String c_XMLE_milestone = "milestone";
    public static String c_XMLE_milestoneTarget = "milestoneTarget";
    public static String c_XMLE_issueComment = "issueComment";
    public static String c_XMLE_comment = "comment";
    public static String c_XMLE_commentNumber = "commentNumber";
    public static String c_XMLE_commentText = "commentText";
    public static String c_XMLE_commentPerson = "commentPerson";
    public static String c_XMLE_commentDate = "commentDate";
    public static String c_XMLE_issueAttachment = "issueAttachment";
    public static String c_XMLE_attachment = "attachment";
    public static String c_XMLE_attachmentFilename = "attachmentFilename";
    public static String c_XMLE_attachmentType = "attachmentType";
    public static String c_XMLE_attachmentCreator = "attachmentCreator";
    public static String c_XMLE_issueActivity = "issueActivity";
    public static String c_XMLE_activity = "activity";
    public static String c_XMLE_activityWho = "activityWho";
    public static String c_XMLE_activityWhen = "activityWhen";
    public static String c_XMLE_activityWRA = "activityWRA";
    public static String c_XMLE_activityWhat = "activityWhat";
    public static String c_XMLE_activityRemoved = "activityRemoved";
    public static String c_XMLE_activityAdded = "activityAdded";
    public static String c_XMLE_issueTracker = "issueTracker";
    public static String c_XMLE_issueTrackerType = "issueTrackerType";
    public static String c_XMLE_issueTrackerURL = "issueTrackerURL";
    
    public static String c_XMLE_issueAnnotationStatus = "issueAnnotationStatus";
    
    public static String c_XMLE_commit = "commit";
    public static String c_XMLE_commitRepository = "commitRepository";
    public static String c_XMLE_commitRevisionTag = "commitRevisionTag";
    public static String c_XMLE_commitAuthor = "commitAuthor";
    public static String c_XMLE_commitCommiter = "commitCommiter";
    public static String c_XMLE_commitDate = "commitDate";
    public static String c_XMLE_commitMessageLog = "commitMessageLog";
    
    public static String c_XMLE_person = "person";
    public static String c_XMLE_personFirstName = "personFirstName";
    public static String c_XMLE_personLastName = "personLastName";
    public static String c_XMLE_personGender = "personGender";
    
    public static String c_XMLE_apiRequest = "apiRequest";
    public static String c_XMLE_apiResponse = "apiResponse";
    public static String c_XMLE_apiCall = "apiCall";
    public static String c_XMLE_requestData = "requestData";
    public static String c_XMLE_inputParameter = "inputParameter";
    
    public static String c_XMLE_QueryBugPerson_isRelatedTo = "isRelatedTo";
    public static String c_XMLE_QueryBugPerson_hasID = "hasID";
    
    public static String c_XMLE_email = "email";
    public static String c_XMLE_id = "id";
    
    public static String c_XMLE_result = "result";
    
    public static String c_XMLE_annotation = "annotation";
    public static String c_XMLE_itemUri = "itemUri";
    public static String c_XMLE_subjectAnnotated = "subjectAnnotated";
    public static String c_XMLE_descriptionAnnotated = "descriptionAnnotated";
    public static String c_XMLE_commentAnnotated = "commentAnnotated";
    public static String c_XMLE_commitAnnotated = "commitAnnotated";
    public static String c_XMLE_titleAnnotated = "titleAnnotated";
    public static String c_XMLE_bodyAnnotated = "bodyAnnotated";
    public static String c_XMLE_subjectConcepts = "subjectConcepts";
    public static String c_XMLE_descriptionConcepts = "descriptionConcepts";
    public static String c_XMLE_commentConcepts = "commentConcepts";
    public static String c_XMLE_commitConcepts = "commitConcepts";
    public static String c_XMLE_titleConcepts = "titleConcepts";
    public static String c_XMLE_bodyConcepts = "bodyConcepts";
    public static String c_XMLE_concept = "concept";
    public static String c_XMLE_count = "count";

    // </editor-fold>
    
    // <editor-fold desc="XML values">
    
    public static String c_XMLV_metadataservice = "METADATASERVICE";
    public static String c_XMLV_metadataserviceaddress = "http://www.alert-project.eu/metadata";
    public static String c_XMLV_request = "request";
    public static String c_XMLV_reply = "reply";
    public static String c_XMLV_OntClass = "OntClass";
    public static String c_XMLV_MemberURL = "MemberURL";
    
    public static String c_XMLV_sparql = "sparql";
    public static String c_XMLV_ontModelSpec = "ontModelSpec";
    public static String c_XMLV_productUri = "productUri";
    public static String c_XMLV_methodUri = "methodUri";
    public static String c_XMLV_issueUri = "issueUri";
    public static String c_XMLV_issueDuplicatesSPARQL = "issueDuplicatesSPARQL";
    
    // </editor-fold>
    
    // <editor-fold desc="API Call">
    
    public static String c_XMLAC_sparql = "sparql";
    public static String c_XMLAC_commit_getRelatedToIssue = "commit.getRelatedToIssue";
    public static String c_XMLAC_commit_getRelatedToKeyword = "commit.getRelatedToKeyword";
    public static String c_XMLAC_competency_getPersonForIssue = "competency.getPersonForIssue";
    public static String c_XMLAC_identity_getForPerson = "identity.getForPerson";
    public static String c_XMLAC_issue_getAllForMethod = "issue.getAllForMethod";
    public static String c_XMLAC_issue_getAllForProduct = "issue.getAllForProduct";
    public static String c_XMLAC_issue_getAnnotationStatus = "issue.getAnnotationStatus";
    public static String c_XMLAC_issue_getDuplicates = "issue.getDuplicates";
    public static String c_XMLAC_issue_getInfo = "issue.getInfo";
    public static String c_XMLAC_issue_getRelatedToIssue = "issue.getRelatedToIssue";
    public static String c_XMLAC_issue_getRelatedToKeyword = "issue.getRelatedToKeyword";
    public static String c_XMLAC_mail_getRelatedToIssue = "mail.getRelatedToIssue";
    public static String c_XMLAC_mail_getRelatedToKeyword = "mail.getRelatedToKeyword";
    public static String c_XMLAC_method_getAllForPerson = "method.getAllForPerson";
    public static String c_XMLAC_method_getRelatedCode = "method.getRelatedCode";
    public static String c_XMLAC_person_getAllForEmail = "person.getAllForEmail";
    public static String c_XMLAC_person_getInfo = "person.getInfo";
    public static String c_XMLAC_post_getRelatedToIssue = "post.getRelatedToIssue";
    public static String c_XMLAC_post_getRelatedToKeyword = "post.getRelatedToKeyword";
    public static String c_XMLAC_wiki_getRelatedToIssue = "wiki.getRelatedToIssue";
    public static String c_XMLAC_wiki_getRelatedToKeyword = "wiki.getRelatedToKeyword";
    
    // </editor-fold>
    
    // <editor-fold desc="Ontology Class">
    
    public static String c_OWLClass_Issue = "Issue";
    public static String c_OWLClass_Bug = "Bug";
    public static String c_OWLClass_Person = "Person";
    public static String c_OWLClass_Milestone = "Milestone";
    public static String c_OWLClass_Comment = "Comment";
    public static String c_OWLClass_Attachment = "Attachment";
    public static String c_OWLClass_Activity = "Activity";
    public static String c_OWLClass_ComputerSystem = "ComputerSystem";
    public static String c_OWLClass_Component = "Component";
    public static String c_OWLClass_Product = "Product";
    public static String c_OWLClass_Commit = "Commit";
    
    //state
    public static String c_OWLClass_Assigned = "Assigned";
    public static String c_OWLClass_Open = "Open";
    public static String c_OWLClass_Resolved = "Resolved";
    public static String c_OWLClass_Verified = "Verified";
    public static String c_OWLClass_Closed = "Closed";
    //resolution
    public static String c_OWLClass_Duplicate = "Duplicate";
    public static String c_OWLClass_Fixed = "Fixed";
    public static String c_OWLClass_Invalid = "Invalid";
    public static String c_OWLClass_ThirdParty = "ThirdParty";
    public static String c_OWLClass_WontFix = "WontFix";
    public static String c_OWLClass_WorksForMe = "WorksForMe";
    public static String c_OWLClass_Later = "Later";
    public static String c_OWLClass_Remind= "Remind";
    //priority
    public static String c_OWLClass_P1 = "P1";
    public static String c_OWLClass_P2 = "P2";
    public static String c_OWLClass_P3 = "P3";
    public static String c_OWLClass_P4 = "P4";
    public static String c_OWLClass_P5 = "P5";
    //priority
    public static String c_OWLClass_Blocker = "Blocker";
    public static String c_OWLClass_Critical = "Critical";
    public static String c_OWLClass_Major = "Major";
    public static String c_OWLClass_Minor = "Minor";
    public static String c_OWLClass_Trivial = "Trivial";
    // </editor-fold>
    
    // <editor-fold desc="Ontology Resource">
    
    public static String c_OWLResource_Issue = "Issue";
    
    // </editor-fold>
    
    // <editor-fold desc="Ontology Members">
    

    
    // </editor-fold>
    
    // <editor-fold desc="Ontology DataProperty">
    
    public static String c_OWLProperty_ = "";
    public static String c_OWLDataProperty_ID = "ID";
    public static String c_OWLDataProperty_URL = "URL";
    public static String c_OWLDataProperty_DateOpened = "dateOpened";
    public static String c_OWLDataProperty_Description = "description";
    public static String c_OWLDataProperty_Keyword = "keyword";
    public static String c_OWLDataProperty_IssueUrl = "issueURL";
    public static String c_OWLDataProperty_LastModified = "lastModified";
    public static String c_OWLDataProperty_Number = "number";
    public static String c_OWLDataProperty_Target = "target";
    public static String c_OWLDataProperty_Date = "date";
    public static String c_OWLDataProperty_Text = "text";
    public static String c_OWLDataProperty_FileName = "fileName";
    public static String c_OWLDataProperty_Type = "type";
    public static String c_OWLDataProperty_What = "what";
    public static String c_OWLDataProperty_Removed = "removed";
    public static String c_OWLDataProperty_Added = "added";
    public static String c_OWLDataProperty_Performed = "performed";
    public static String c_OWLDataProperty_Platform = "platform";
    public static String c_OWLDataProperty_Os = "os";
    public static String c_OWLDataProperty_Version = "version";
    public static String c_OWLDataProperty_Email = "email";
    public static String c_OWLDataProperty_FirstName = "firstName";
    public static String c_OWLDataProperty_LastName = "lastName";

    public static String c_OWLDataProperty_RevisionTag = "revisionTag";
    public static String c_OWLDataProperty_CommitDate = "commitDate";
    public static String c_OWLDataProperty_CommitMessage = "commitMessage";
    // </editor-fold>
    
    // <editor-fold desc="Ontology ObjectProperty">
    
    public static String c_OWLObjectProperty_Blocks = "blocks";
    public static String c_OWLObjectProperty_DependsOn = "dependsOn";
    public static String c_OWLObjectProperty_Fixes = "fixes";
    public static String c_OWLObjectProperty_HasReporter = "hasReporter";
    public static String c_OWLObjectProperty_HasState = "hasState";
    public static String c_OWLObjectProperty_HasResolution = "hasResolution";
    public static String c_OWLObjectProperty_InProject = "inProject";
    public static String c_OWLObjectProperty_HasComputerSystem = "hasComputerSystem";
    public static String c_OWLObjectProperty_HasPriority = "hasPriority";
    public static String c_OWLObjectProperty_HasSeverity = "hasSeverity";
    public static String c_OWLObjectProperty_HasAssignee = "hasAssignee";
    public static String c_OWLObjectProperty_HasCCPerson = "hasCcPerson";
    public static String c_OWLObjectProperty_IsDuplicateOf = "isDuplicateOf";
    public static String c_OWLObjectProperty_IsMergedInto = "isMergedInto";
    public static String c_OWLObjectProperty_HasMilestone = "hasMilestone";
    public static String c_OWLObjectProperty_HasComment = "hasComment";
    public static String c_OWLObjectProperty_HasCommentor = "hasCommentor";
    public static String c_OWLObjectProperty_HasAttachment = "hasAttachment";
    public static String c_OWLObjectProperty_HasCreator = "hasCreator";
    public static String c_OWLObjectProperty_HasActivity = "hasActivity";
    public static String c_OWLObjectProperty_HasInvolvedPerson = "hasInvolvedPerson";
    public static String c_OWLObjectProperty_IsIssueOf = "isIssueOf";
    public static String c_OWLObjectProperty_IsComponentOf = "isComponentOf";
    public static String c_OWLObjectProperty_RelatedToSourceCode = "relatedtoSourceCode";
    
    public static String c_OWLObjectProperty_IsCommitOfRepository = "isCommitOfRepository";
    public static String c_OWLObjectProperty_HasAuthor = "hasAuthor";
    public static String c_OWLObjectProperty_HasCommiter = "hasCommiter";            
    // </editor-fold>
            
    // <editor-fold desc="Ontology AnnotationProperty">
    
    public static String c_OWLAnnotationProperty_comment = "http://www.w3.org/2000/01/rdf-schema#comment";
    public static String c_OWLAnnotationProperty_apDescription = "apDescription";
    public static String c_OWLAnnotationProperty_apSubject = "apSubject";
    public static String c_OWLAnnotationProperty_apComment = "apComment";
    public static String c_OWLAnnotationProperty_apCommit = "apCommit";
    public static String c_OWLAnnotationProperty_apTitle = "apTitle";
    public static String c_OWLAnnotationProperty_apBody = "apBody";
    
    // </editor-fold>
        
    // <editor-fold desc="NameSpace">
    
    public static String c_NS_Ifi = "http://www.ifi.uzh.ch/ddis/evoont/2008/11/bom#";
    public static String c_NS_Alert = "http://www.alert-project.eu/ontologies/alert.owl#";
    public static String c_NS_Alert_Its = "http://www.alert-project.eu/ontologies/alert_its.owl#";
    public static String c_NS_Alert_Scm = "http://www.alert-project.eu/ontologies/alert_scm.owl#";
    public static String c_NS_foaf = "http://xmlns.com/foaf/0.1/";
    public static String c_NS_doap = "http://usefulinc.com/ns/doap#";

    // </editor-fold>
    
    // <editor-fold desc="Constants">
    public static enum PersonRole {
        CommunityManagerFacilitator,
        Designer,
        DesignerArtworkDeveloper,
        Developer,
        DistributionReleaseDeveloper,
        DocumentationWriter,
        Leader,
        Maintainer,
        ProjectLeader,
        SoftwareAnalyst,
        Tester,
        Translator,
        User,
        UserExperienceDeveloperManager
    }
    // </editor-fold>
    
    // </editor-fold>
}

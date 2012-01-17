/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package MetadataCore;

import MetadataCore.MetadataGlobal.AnnotationData;
import MetadataObjects.Component;
import MetadataObjects.Issue;
import MetadataObjects.Commit;
import MetadataObjects.MetadataPerson;
import MetadataObjects.foaf_Person;

/**
 *
 * @author ivano
 */
public class MetadataObjectFactory {
    
    /** 
     * @summary Method for creating new bug
     * @startRealisation Sasa Stojanovic 24.06.2011.
     * @finalModification Sasa Stojanovic 24.06.2011.
     * @return Bug object
     */
    public static Issue CreateNewIssue()
    {
        try
        {
            Issue oIssue = new Issue();
            return oIssue;
        }
        catch(Exception e)
        {
            e.printStackTrace();
            return null;
        }
    }
    
    /** 
     * @summary Method for creating new commit
     * @startRealisation Sasa Stojanovic 16.01.2012.
     * @finalModification Sasa Stojanovic 16.01.2012.
     * @return Bug object
     */
    public static Commit CreateNewCommit()
    {
        try
        {
            Commit oCommit = new Commit();
            return oCommit;
        }
        catch(Exception e)
        {
            e.printStackTrace();
            return null;
        }
    }
    
    /** 
     * @summary Method for creating new person
     * @startRealisation Sasa Stojanovic 24.06.2011.
     * @finalModification Sasa Stojanovic 24.06.2011.
     * @return MetadataPerson object
     */
    public static foaf_Person CreateNewPerson()
    {
        try
        {
            foaf_Person oPerson = new foaf_Person();
            return oPerson;
        }
        catch(Exception e)
        {
            e.printStackTrace();
            return null;
        }
    }

    /** 
     * @summary Method for creating new component
     * @startRealisation Sasa Stojanovic 31.10.2011.
     * @finalModification Sasa Stojanovic 31.10.2011.
     * @return MetadataPerson object
     */
    public static Component CreateNewComponent() {
        try
        {
            Component oComponent = new Component();
            return oComponent;
        }
        catch(Exception e)
        {
            e.printStackTrace();
            return null;
        }
    }
    
    /** 
     * @summary Method for creating new bug annotation.
     * @startRealisation  Dejan Milosavljevic 16.01.2012.
     * @finalModification Dejan Milosavljevic 16.01.2012.
     * @return Bug object
     */
    public static AnnotationData CreateNewAnnotation()
    {
        try
        {
            AnnotationData oAnnotation = new AnnotationData();
            return oAnnotation;
        }
        catch(Exception e)
        {
            e.printStackTrace();
            return null;
        }
    }
}
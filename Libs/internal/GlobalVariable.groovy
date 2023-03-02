package internal

import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.main.TestCaseMain


/**
 * This class is generated automatically by Katalon Studio and should not be modified or deleted.
 */
public class GlobalVariable {
     
    /**
     * <p></p>
     */
    public static Object username
     
    /**
     * <p></p>
     */
    public static Object password
     
    /**
     * <p></p>
     */
    public static Object firstname
     
    /**
     * <p></p>
     */
    public static Object lastname
     
    /**
     * <p></p>
     */
    public static Object postalcode
     
    /**
     * <p></p>
     */
    public static Object url
     
    /**
     * <p></p>
     */
    public static Object generalTime
     
    /**
     * <p></p>
     */
    public static Object closeBrowserLogin
     
    /**
     * <p></p>
     */
    public static Object closeBrowserAddItem
     

    static {
        try {
            def selectedVariables = TestCaseMain.getGlobalVariables("default")
			selectedVariables += TestCaseMain.getGlobalVariables(RunConfiguration.getExecutionProfile())
            selectedVariables += TestCaseMain.getParsedValues(RunConfiguration.getOverridingParameters())
    
            username = selectedVariables['username']
            password = selectedVariables['password']
            firstname = selectedVariables['firstname']
            lastname = selectedVariables['lastname']
            postalcode = selectedVariables['postalcode']
            url = selectedVariables['url']
            generalTime = selectedVariables['generalTime']
            closeBrowserLogin = selectedVariables['closeBrowserLogin']
            closeBrowserAddItem = selectedVariables['closeBrowserAddItem']
            
        } catch (Exception e) {
            TestCaseMain.logGlobalVariableError(e)
        }
    }
}

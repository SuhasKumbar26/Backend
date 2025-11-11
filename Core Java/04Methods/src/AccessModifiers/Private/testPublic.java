package AccessModifiers.Private;

import AccessModifiers.Public.publicMethod;

public class testPublic {

    public void testing(){
        publicMethod method = new publicMethod();
        method.methodIsPublic();
    }
}

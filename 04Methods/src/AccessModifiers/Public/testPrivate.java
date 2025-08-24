package AccessModifiers.Public;

import AccessModifiers.Private.privateMethod;

public class testPrivate {
    public void testing(){
        privateMethod method = new privateMethod();
//        method.methodIsPrivate();
        // 'methodIsPrivate()' has private access in 'AccessModifiers.Private.privateMethod
        method.testMethod();
    }
}

package dk.jlo;

import java.security.Permission;

public class SecurityManager extends java.lang.SecurityManager {

    @Override
    public void checkPermission(Permission perm) {
    }

    @Override
    public void checkPermission(Permission perm, Object context) {
    }

    @Override
    public void checkConnect(String host, int port) {
        if("eb.dk".equals(host)) {
            throw new SecurityException("No can do, Jose!");
        }
        super.checkConnect(host, port);
    }

    @Override
    public void checkConnect(String host, int port, Object context) {
        if("eb.dk".equals(host)) {
            throw new SecurityException("No can do, Jose!");
        }
        super.checkConnect(host, port, context);
    }
}

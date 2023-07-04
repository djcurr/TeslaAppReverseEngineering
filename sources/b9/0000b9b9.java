package v70;

import java.math.BigInteger;
import java.security.cert.X509Extension;
import java.util.Date;

/* loaded from: classes5.dex */
public interface h extends X509Extension {
    void checkValidity(Date date);

    f[] getAttributes(String str);

    byte[] getEncoded();

    a getHolder();

    b getIssuer();

    Date getNotAfter();

    BigInteger getSerialNumber();
}
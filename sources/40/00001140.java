package ch.qos.logback.core.net.ssl;

import ch.qos.logback.core.util.LocationUtil;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;

/* loaded from: classes.dex */
public class KeyStoreFactoryBean {
    private String location;
    private String password;
    private String provider;
    private String type;

    private KeyStore newKeyStore() {
        return getProvider() != null ? KeyStore.getInstance(getType(), getProvider()) : KeyStore.getInstance(getType());
    }

    public KeyStore createKeyStore() {
        if (getLocation() != null) {
            InputStream inputStream = null;
            try {
                try {
                    try {
                        inputStream = FirebasePerfUrlConnection.openStream(LocationUtil.urlForResource(getLocation()));
                        KeyStore newKeyStore = newKeyStore();
                        newKeyStore.load(inputStream, getPassword().toCharArray());
                        return newKeyStore;
                    } catch (NoSuchAlgorithmException unused) {
                        throw new NoSuchAlgorithmException("no such keystore type: " + getType());
                    } catch (Exception e11) {
                        throw new KeyStoreException(getLocation() + ": " + e11.getMessage(), e11);
                    }
                } catch (FileNotFoundException unused2) {
                    throw new KeyStoreException(getLocation() + ": file not found");
                } catch (NoSuchProviderException unused3) {
                    throw new NoSuchProviderException("no such keystore provider: " + getProvider());
                }
            } finally {
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException e12) {
                        e12.printStackTrace(System.err);
                    }
                }
            }
        }
        throw new IllegalArgumentException("location is required");
    }

    public String getLocation() {
        return this.location;
    }

    public String getPassword() {
        String str = this.password;
        return str == null ? SSL.DEFAULT_KEYSTORE_PASSWORD : str;
    }

    public String getProvider() {
        return this.provider;
    }

    public String getType() {
        String str = this.type;
        return str == null ? SSL.DEFAULT_KEYSTORE_TYPE : str;
    }

    public void setLocation(String str) {
        this.location = str;
    }

    public void setPassword(String str) {
        this.password = str;
    }

    public void setProvider(String str) {
        this.provider = str;
    }

    public void setType(String str) {
        this.type = str;
    }
}
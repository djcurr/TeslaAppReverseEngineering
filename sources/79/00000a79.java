package atd.e;

import atd.d.i;
import com.adyen.threeds2.ProtocolErrorEvent;
import com.adyen.threeds2.RuntimeErrorEvent;

/* loaded from: classes.dex */
public enum c {
    MESSAGE_RECEIVED_INVALID(atd.s0.a.a(-91202294442560L), atd.s0.a.a(-91219474311744L), atd.s0.a.a(-91210884377152L), atd.s0.a.a(-91064855489088L)),
    MESSAGE_VERSION_NOT_SUPPORTED(atd.s0.a.a(-90399135558208L), atd.s0.a.a(-90416315427392L), atd.s0.a.a(-90407725492800L), atd.s0.a.a(-90588114119232L)),
    DATA_ELEMENT_MISSING(atd.s0.a.a(-90682603399744L), atd.s0.a.a(-90699783268928L), atd.s0.a.a(-90450675165760L), atd.s0.a.a(-90558049348160L)),
    MESSAGE_EXTENSION_MISSING(atd.s0.a.a(-89875149548096L), atd.s0.a.a(-89617451510336L), atd.s0.a.a(-89643221314112L), atd.s0.a.a(-90077013011008L)),
    DATA_ELEMENT_INVALID_FORMAT(atd.s0.a.a(-89969638828608L), atd.s0.a.a(-89986818697792L), atd.s0.a.a(-89978228763200L), atd.s0.a.a(-89084875565632L)),
    DUPLICATE_DATA_ELEMENT(atd.s0.a.a(-89480012556864L), atd.s0.a.a(-89497192426048L), atd.s0.a.a(-89522962229824L), atd.s0.a.a(-89351163537984L)),
    TRANSACTION_ID_NOT_RECOGNIZED(atd.s0.a.a(-88651083868736L), atd.s0.a.a(-88668263737920L), atd.s0.a.a(-88694033541696L), atd.s0.a.a(-88560889555520L)),
    DATA_DECRYPTION_FAILURE(atd.s0.a.a(-88951731579456L), atd.s0.a.a(-88968911448640L), atd.s0.a.a(-88960321514048L), atd.s0.a.a(-88818587593280L)),
    ACCESS_DENIED(atd.s0.a.a(-88874422168128L), atd.s0.a.a(-88891602037312L), atd.s0.a.a(-88917371841088L), atd.s0.a.a(-88225882106432L)),
    ISO_CODE_INVALID(atd.s0.a.a(-88062673349184L), atd.s0.a.a(-88079853218368L), atd.s0.a.a(-88071263283776L), atd.s0.a.a(-88440630471232L)),
    TRANSACTION_TIMED_OUT(atd.s0.a.a(-88255946877504L), atd.s0.a.a(-88273126746688L), atd.s0.a.a(-88298896550464L), atd.s0.a.a(-87581637012032L)),
    TRANSIENT_SYSTEM_FAILURE(atd.s0.a.a(-87418428254784L), atd.s0.a.a(-87435608123968L), atd.s0.a.a(-87461377927744L), atd.s0.a.a(-87830745115200L)),
    SYSTEM_CONNECTION_FAILURE(atd.s0.a.a(-87697601129024L), atd.s0.a.a(-87714780998208L), atd.s0.a.a(-87706191063616L), atd.s0.a.a(-87010406361664L));
    
    private final String mErrorCode;
    private final String mErrorComponent;
    private final String mErrorDescription;
    private final String mErrorMessageType;

    c(String str, String str2, String str3, String str4) {
        this.mErrorCode = str;
        this.mErrorComponent = str2;
        this.mErrorDescription = str3;
        this.mErrorMessageType = str4;
    }

    public String a() {
        return this.mErrorCode;
    }

    public String b() {
        return this.mErrorComponent;
    }

    public String c() {
        return this.mErrorDescription;
    }

    public String d() {
        return this.mErrorMessageType;
    }

    public atd.d.d a(i iVar, String str) {
        return new atd.d.d(iVar.d(), iVar.h(), iVar.b(), iVar.f(), iVar.g(), this, str);
    }

    public ProtocolErrorEvent a(String str, String str2) {
        return new atd.z.c(str, new atd.z.b(str, this.mErrorCode, this.mErrorDescription, str2));
    }

    public RuntimeErrorEvent a(String str) {
        return new atd.z.d(this.mErrorCode, this.mErrorDescription);
    }
}
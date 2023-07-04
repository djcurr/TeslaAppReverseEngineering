package sv;

import com.withpersona.sdk.inquiry.database.network.CreateDatabaseVerificationRequest;
import com.withpersona.sdk.inquiry.database.network.CreateDatabaseVerificationResponse;
import com.withpersona.sdk.inquiry.database.network.DatabaseVerificationStatusResponse;
import com.withpersona.sdk.inquiry.database.network.SubmitDatabaseVerificationRequest;
import com.withpersona.sdk.inquiry.database.network.UpdateDatabaseVerificationRequest;
import kotlin.Metadata;
import m80.f;
import m80.i;
import m80.o;
import m80.p;
import m80.s;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J-\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H§@ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ7\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\n\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u000bH§@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ7\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\f0\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\n\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u000fH§@ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J-\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\f0\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\n\u001a\u00020\u0002H§@ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0014"}, d2 = {"Lsv/c;", "", "", "sessionToken", "Lcom/withpersona/sdk/inquiry/database/network/CreateDatabaseVerificationRequest;", "request", "Lretrofit2/s;", "Lcom/withpersona/sdk/inquiry/database/network/CreateDatabaseVerificationResponse;", cg.c.f9084i, "(Ljava/lang/String;Lcom/withpersona/sdk/inquiry/database/network/CreateDatabaseVerificationRequest;Lzz/d;)Ljava/lang/Object;", "verificationToken", "Lcom/withpersona/sdk/inquiry/database/network/UpdateDatabaseVerificationRequest;", "Lcom/withpersona/sdk/inquiry/database/network/DatabaseVerificationStatusResponse;", "b", "(Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk/inquiry/database/network/UpdateDatabaseVerificationRequest;Lzz/d;)Ljava/lang/Object;", "Lcom/withpersona/sdk/inquiry/database/network/SubmitDatabaseVerificationRequest;", "d", "(Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk/inquiry/database/network/SubmitDatabaseVerificationRequest;Lzz/d;)Ljava/lang/Object;", "a", "(Ljava/lang/String;Ljava/lang/String;Lzz/d;)Ljava/lang/Object;", "database_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes6.dex */
public interface c {
    @f("/api/internal/verify/v1/verification/databases/{verificationToken}")
    Object a(@i("Authorization") String str, @s("verificationToken") String str2, zz.d<? super retrofit2.s<DatabaseVerificationStatusResponse>> dVar);

    @p("/api/internal/verify/v1/verification/databases/{verificationToken}")
    Object b(@i("Authorization") String str, @s("verificationToken") String str2, @m80.a UpdateDatabaseVerificationRequest updateDatabaseVerificationRequest, zz.d<? super retrofit2.s<DatabaseVerificationStatusResponse>> dVar);

    @o("/api/internal/verify/v1/verification/databases")
    Object c(@i("Authorization") String str, @m80.a CreateDatabaseVerificationRequest createDatabaseVerificationRequest, zz.d<? super retrofit2.s<CreateDatabaseVerificationResponse>> dVar);

    @o("/api/internal/verify/v1/verification/databases/{verificationToken}/submit")
    Object d(@i("Authorization") String str, @s("verificationToken") String str2, @m80.a SubmitDatabaseVerificationRequest submitDatabaseVerificationRequest, zz.d<? super retrofit2.s<DatabaseVerificationStatusResponse>> dVar);
}
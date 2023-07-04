package fw;

import cg.c;
import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import com.withpersona.sdk.inquiry.phone.network.CreateVerificationRequest;
import com.withpersona.sdk.inquiry.phone.network.CreateVerificationResponse;
import com.withpersona.sdk.inquiry.phone.network.GenerateConfirmationCodeRequest;
import com.withpersona.sdk.inquiry.phone.network.GenerateConfirmationCodeResponse;
import com.withpersona.sdk.inquiry.phone.network.SubmitConfirmationCodeRequest;
import com.withpersona.sdk.inquiry.phone.network.SubmitConfirmationCodeResponse;
import com.withpersona.sdk.inquiry.phone.network.SubmitNameResponse;
import kotlin.Metadata;
import m80.f;
import m80.i;
import m80.o;
import retrofit2.s;
import zz.d;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J-\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H§@ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ7\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\n\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u000bH§@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ7\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\n\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u000fH§@ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012J-\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\n\u001a\u00020\u0002H§@ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0016"}, d2 = {"Lfw/a;", "", "", "sessionToken", "Lcom/withpersona/sdk/inquiry/phone/network/CreateVerificationRequest;", MessageExtension.FIELD_DATA, "Lretrofit2/s;", "Lcom/withpersona/sdk/inquiry/phone/network/CreateVerificationResponse;", "a", "(Ljava/lang/String;Lcom/withpersona/sdk/inquiry/phone/network/CreateVerificationRequest;Lzz/d;)Ljava/lang/Object;", "verificationId", "Lcom/withpersona/sdk/inquiry/phone/network/GenerateConfirmationCodeRequest;", "Lcom/withpersona/sdk/inquiry/phone/network/GenerateConfirmationCodeResponse;", c.f9084i, "(Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk/inquiry/phone/network/GenerateConfirmationCodeRequest;Lzz/d;)Ljava/lang/Object;", "Lcom/withpersona/sdk/inquiry/phone/network/SubmitConfirmationCodeRequest;", "Lcom/withpersona/sdk/inquiry/phone/network/SubmitConfirmationCodeResponse;", "d", "(Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk/inquiry/phone/network/SubmitConfirmationCodeRequest;Lzz/d;)Ljava/lang/Object;", "Lcom/withpersona/sdk/inquiry/phone/network/SubmitNameResponse;", "b", "(Ljava/lang/String;Ljava/lang/String;Lzz/d;)Ljava/lang/Object;", "phone_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes6.dex */
public interface a {
    @o("/api/internal/verify/v1/verification/phone-numbers")
    Object a(@i("Authorization") String str, @m80.a CreateVerificationRequest createVerificationRequest, d<? super s<CreateVerificationResponse>> dVar);

    @f("/api/internal/verify/v1/verification/phone-numbers/{verificationToken}")
    Object b(@i("Authorization") String str, @m80.s("verificationToken") String str2, d<? super s<SubmitNameResponse>> dVar);

    @o("/api/internal/verify/v1/verification/phone-numbers/{verificationToken}/sms-confirmation-code")
    Object c(@i("Authorization") String str, @m80.s("verificationToken") String str2, @m80.a GenerateConfirmationCodeRequest generateConfirmationCodeRequest, d<? super s<GenerateConfirmationCodeResponse>> dVar);

    @o("/api/internal/verify/v1/verification/phone-numbers/{verificationToken}/confirm")
    Object d(@i("Authorization") String str, @m80.s("verificationToken") String str2, @m80.a SubmitConfirmationCodeRequest submitConfirmationCodeRequest, d<? super s<SubmitConfirmationCodeResponse>> dVar);
}
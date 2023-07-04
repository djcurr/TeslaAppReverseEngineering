package com.stripe.android.stripe3ds2.transactions;

import com.google.android.gms.wallet.WalletConstants;

/* loaded from: classes6.dex */
public enum ProtocolError {
    InvalidMessageReceived(101, "Message is not AReq, ARes, CReq, CRes, PReq, PRes, RReq, or RRes"),
    UnsupportedMessageVersion(102, "Message Version Number received is not valid for the receiving component."),
    RequiredDataElementMissing(201, "A message element required as defined in Table A.1 is missing from the message."),
    UnrecognizedCriticalMessageExtensions(202, "Critical message extension not recognised."),
    InvalidDataElementFormat(203, "Data element not in the required format or value is invalid as defined in Table A.1"),
    InvalidTransactionId(301, "Transaction ID received is not valid for the receiving component."),
    DataDecryptionFailure(302, "Data could not be decrypted by the receiving system due to technical or other reason."),
    TransactionTimedout(WalletConstants.ERROR_CODE_SERVICE_UNAVAILABLE, "Transaction timed-out.");
    
    private final int code;
    private final String description;

    ProtocolError(int i11, String str) {
        this.code = i11;
        this.description = str;
    }

    public final int getCode() {
        return this.code;
    }

    public final String getDescription() {
        return this.description;
    }
}
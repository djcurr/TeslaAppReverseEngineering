package com.adyen.threeds2;

/* loaded from: classes.dex */
public interface ChallengeStatusReceiver {
    void cancelled();

    void completed(CompletionEvent completionEvent);

    void protocolError(ProtocolErrorEvent protocolErrorEvent);

    void runtimeError(RuntimeErrorEvent runtimeErrorEvent);

    void timedout();
}
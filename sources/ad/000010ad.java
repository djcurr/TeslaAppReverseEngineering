package ch.qos.logback.core;

import ch.qos.logback.core.spi.AppenderAttachable;
import ch.qos.logback.core.spi.AppenderAttachableImpl;
import ch.qos.logback.core.util.InterruptUtil;
import java.util.Iterator;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

/* loaded from: classes.dex */
public class AsyncAppenderBase<E> extends UnsynchronizedAppenderBase<E> implements AppenderAttachable<E> {
    public static final int DEFAULT_MAX_FLUSH_TIME = 1000;
    public static final int DEFAULT_QUEUE_SIZE = 256;
    static final int UNDEFINED = -1;
    BlockingQueue<E> blockingQueue;
    AppenderAttachableImpl<E> aai = new AppenderAttachableImpl<>();
    int queueSize = 256;
    int appenderCount = 0;
    int discardingThreshold = -1;
    boolean neverBlock = false;
    AsyncAppenderBase<E>.Worker worker = new Worker();
    int maxFlushTime = 1000;

    /* loaded from: classes.dex */
    class Worker extends Thread {
        Worker() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            AsyncAppenderBase asyncAppenderBase = AsyncAppenderBase.this;
            AppenderAttachableImpl<E> appenderAttachableImpl = asyncAppenderBase.aai;
            while (asyncAppenderBase.isStarted()) {
                try {
                    appenderAttachableImpl.appendLoopOnAppenders(asyncAppenderBase.blockingQueue.take());
                } catch (InterruptedException unused) {
                }
            }
            AsyncAppenderBase.this.addInfo("Worker thread will flush remaining events before exiting.");
            for (Object obj : asyncAppenderBase.blockingQueue) {
                appenderAttachableImpl.appendLoopOnAppenders(obj);
                asyncAppenderBase.blockingQueue.remove(obj);
            }
            appenderAttachableImpl.detachAndStopAllAppenders();
        }
    }

    private boolean isQueueBelowDiscardingThreshold() {
        return this.blockingQueue.remainingCapacity() < this.discardingThreshold;
    }

    private void put(E e11) {
        if (this.neverBlock) {
            this.blockingQueue.offer(e11);
        } else {
            putUninterruptibly(e11);
        }
    }

    private void putUninterruptibly(E e11) {
        boolean z11 = false;
        while (true) {
            try {
                this.blockingQueue.put(e11);
                break;
            } catch (InterruptedException unused) {
                z11 = true;
            } catch (Throwable th2) {
                if (z11) {
                    Thread.currentThread().interrupt();
                }
                throw th2;
            }
        }
        if (z11) {
            Thread.currentThread().interrupt();
        }
    }

    @Override // ch.qos.logback.core.spi.AppenderAttachable
    public void addAppender(Appender<E> appender) {
        int i11 = this.appenderCount;
        if (i11 != 0) {
            addWarn("One and only one appender may be attached to AsyncAppender.");
            addWarn("Ignoring additional appender named [" + appender.getName() + "]");
            return;
        }
        this.appenderCount = i11 + 1;
        addInfo("Attaching appender named [" + appender.getName() + "] to AsyncAppender.");
        this.aai.addAppender(appender);
    }

    @Override // ch.qos.logback.core.UnsynchronizedAppenderBase
    protected void append(E e11) {
        if (isQueueBelowDiscardingThreshold() && isDiscardable(e11)) {
            return;
        }
        preprocess(e11);
        put(e11);
    }

    @Override // ch.qos.logback.core.spi.AppenderAttachable
    public void detachAndStopAllAppenders() {
        this.aai.detachAndStopAllAppenders();
    }

    @Override // ch.qos.logback.core.spi.AppenderAttachable
    public boolean detachAppender(Appender<E> appender) {
        return this.aai.detachAppender(appender);
    }

    @Override // ch.qos.logback.core.spi.AppenderAttachable
    public boolean detachAppender(String str) {
        return this.aai.detachAppender(str);
    }

    @Override // ch.qos.logback.core.spi.AppenderAttachable
    public Appender<E> getAppender(String str) {
        return this.aai.getAppender(str);
    }

    public int getDiscardingThreshold() {
        return this.discardingThreshold;
    }

    public int getMaxFlushTime() {
        return this.maxFlushTime;
    }

    public int getNumberOfElementsInQueue() {
        return this.blockingQueue.size();
    }

    public int getQueueSize() {
        return this.queueSize;
    }

    public int getRemainingCapacity() {
        return this.blockingQueue.remainingCapacity();
    }

    @Override // ch.qos.logback.core.spi.AppenderAttachable
    public boolean isAttached(Appender<E> appender) {
        return this.aai.isAttached(appender);
    }

    protected boolean isDiscardable(E e11) {
        return false;
    }

    public boolean isNeverBlock() {
        return this.neverBlock;
    }

    @Override // ch.qos.logback.core.spi.AppenderAttachable
    public Iterator<Appender<E>> iteratorForAppenders() {
        return this.aai.iteratorForAppenders();
    }

    protected void preprocess(E e11) {
    }

    public void setDiscardingThreshold(int i11) {
        this.discardingThreshold = i11;
    }

    public void setMaxFlushTime(int i11) {
        this.maxFlushTime = i11;
    }

    public void setNeverBlock(boolean z11) {
        this.neverBlock = z11;
    }

    public void setQueueSize(int i11) {
        this.queueSize = i11;
    }

    @Override // ch.qos.logback.core.UnsynchronizedAppenderBase, ch.qos.logback.core.spi.LifeCycle
    public void start() {
        if (isStarted()) {
            return;
        }
        if (this.appenderCount == 0) {
            addError("No attached appenders found.");
        } else if (this.queueSize < 1) {
            addError("Invalid queue size [" + this.queueSize + "]");
        } else {
            this.blockingQueue = new ArrayBlockingQueue(this.queueSize);
            if (this.discardingThreshold == -1) {
                this.discardingThreshold = this.queueSize / 5;
            }
            addInfo("Setting discardingThreshold to " + this.discardingThreshold);
            this.worker.setDaemon(true);
            AsyncAppenderBase<E>.Worker worker = this.worker;
            worker.setName("AsyncAppender-Worker-" + getName());
            super.start();
            this.worker.start();
        }
    }

    @Override // ch.qos.logback.core.UnsynchronizedAppenderBase, ch.qos.logback.core.spi.LifeCycle
    public void stop() {
        if (isStarted()) {
            super.stop();
            this.worker.interrupt();
            InterruptUtil interruptUtil = new InterruptUtil(this.context);
            try {
                try {
                    interruptUtil.maskInterruptFlag();
                    this.worker.join(this.maxFlushTime);
                    if (this.worker.isAlive()) {
                        addWarn("Max queue flush timeout (" + this.maxFlushTime + " ms) exceeded. " + this.blockingQueue.size() + " queued events were possibly discarded.");
                    } else {
                        addInfo("Queue flush finished successfully within timeout.");
                    }
                } catch (InterruptedException e11) {
                    int size = this.blockingQueue.size();
                    addError("Failed to join worker thread. " + size + " queued events may be discarded.", e11);
                }
            } finally {
                interruptUtil.unmaskInterruptFlag();
            }
        }
    }
}
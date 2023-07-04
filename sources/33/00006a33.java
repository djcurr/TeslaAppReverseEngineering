package expo.modules.interfaces.taskManager;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Context;
import android.content.Intent;
import expo.modules.core.interfaces.DoNotStrip;
import java.lang.ref.WeakReference;
import java.util.Map;

/* loaded from: classes5.dex */
public abstract class TaskConsumer implements TaskConsumerInterface {
    @DoNotStrip
    public static int VERSION;
    private WeakReference<Context> mContextRef;
    private TaskManagerUtilsInterface mTaskManagerUtils;

    public TaskConsumer(Context context, TaskManagerUtilsInterface taskManagerUtilsInterface) {
        this.mContextRef = new WeakReference<>(context);
        this.mTaskManagerUtils = taskManagerUtilsInterface;
    }

    @Override // expo.modules.interfaces.taskManager.TaskConsumerInterface
    public boolean canReceiveCustomBroadcast(String str) {
        return false;
    }

    @Override // expo.modules.interfaces.taskManager.TaskConsumerInterface
    public boolean didCancelJob(JobService jobService, JobParameters jobParameters) {
        return false;
    }

    @Override // expo.modules.interfaces.taskManager.TaskConsumerInterface
    public boolean didExecuteJob(JobService jobService, JobParameters jobParameters) {
        return false;
    }

    @Override // expo.modules.interfaces.taskManager.TaskConsumerInterface
    public void didReceiveBroadcast(Intent intent) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public Context getContext() {
        WeakReference<Context> weakReference = this.mContextRef;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public TaskManagerUtilsInterface getTaskManagerUtils() {
        return this.mTaskManagerUtils;
    }

    @Override // expo.modules.interfaces.taskManager.TaskConsumerInterface
    public void setOptions(Map<String, Object> map) {
    }
}
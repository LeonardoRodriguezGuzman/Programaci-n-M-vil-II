package com.lrgs18120163.sicedroid.data

import android.app.PendingIntent
import android.content.Context
import androidx.lifecycle.LiveData
import androidx.work.Configuration
import androidx.work.ExistingPeriodicWorkPolicy
import androidx.work.ExistingWorkPolicy
import androidx.work.OneTimeWorkRequest
import androidx.work.Operation
import androidx.work.PeriodicWorkRequest
import androidx.work.WorkContinuation
import androidx.work.WorkInfo
import androidx.work.WorkManager
import androidx.work.WorkQuery
import androidx.work.WorkRequest
import com.google.common.util.concurrent.ListenableFuture
import kotlinx.coroutines.flow.Flow
import java.util.UUID


//LoginWorker(ctx: Context)
class WorkManagerRepository(ctx: Context) : WorkManager() {
    private val workManager = WorkManager.getInstance(ctx)
     val outputWorkInfo: WorkManager = workManager
    override fun getConfiguration(): Configuration {
        TODO("Not yet implemented")
    }

    override fun enqueue(requests: MutableList<out WorkRequest>): Operation {
        TODO("Not yet implemented")
    }

    override fun beginWith(work: MutableList<OneTimeWorkRequest>): WorkContinuation {
        TODO("Not yet implemented")
    }

    override fun beginUniqueWork(
        uniqueWorkName: String,
        existingWorkPolicy: ExistingWorkPolicy,
        work: MutableList<OneTimeWorkRequest>
    ): WorkContinuation {
        TODO("Not yet implemented")
    }

    override fun enqueueUniqueWork(
        uniqueWorkName: String,
        existingWorkPolicy: ExistingWorkPolicy,
        work: MutableList<OneTimeWorkRequest>
    ): Operation {
        TODO("Not yet implemented")
    }

    override fun enqueueUniquePeriodicWork(
        uniqueWorkName: String,
        existingPeriodicWorkPolicy: ExistingPeriodicWorkPolicy,
        periodicWork: PeriodicWorkRequest
    ): Operation {
        TODO("Not yet implemented")
    }

    override fun cancelWorkById(id: UUID): Operation {
        TODO("Not yet implemented")
    }

    override fun cancelAllWorkByTag(tag: String): Operation {
        TODO("Not yet implemented")
    }

    override fun cancelUniqueWork(uniqueWorkName: String): Operation {
        TODO("Not yet implemented")
    }

    override fun cancelAllWork(): Operation {
        TODO("Not yet implemented")
    }

    override fun createCancelPendingIntent(id: UUID): PendingIntent {
        TODO("Not yet implemented")
    }

    override fun pruneWork(): Operation {
        TODO("Not yet implemented")
    }

    override fun getLastCancelAllTimeMillisLiveData(): LiveData<Long> {
        TODO("Not yet implemented")
    }

    override fun getLastCancelAllTimeMillis(): ListenableFuture<Long> {
        TODO("Not yet implemented")
    }

    override fun getWorkInfoByIdLiveData(id: UUID): LiveData<WorkInfo> {
        TODO("Not yet implemented")
    }

    override fun getWorkInfoByIdFlow(id: UUID): Flow<WorkInfo> {
        TODO("Not yet implemented")
    }

    override fun getWorkInfoById(id: UUID): ListenableFuture<WorkInfo> {
        TODO("Not yet implemented")
    }

    override fun getWorkInfosByTagLiveData(tag: String): LiveData<MutableList<WorkInfo>> {
        TODO("Not yet implemented")
    }

    override fun getWorkInfosByTagFlow(tag: String): Flow<MutableList<WorkInfo>> {
        TODO("Not yet implemented")
    }

    override fun getWorkInfosByTag(tag: String): ListenableFuture<MutableList<WorkInfo>> {
        TODO("Not yet implemented")
    }

    override fun getWorkInfosForUniqueWorkLiveData(uniqueWorkName: String): LiveData<MutableList<WorkInfo>> {
        TODO("Not yet implemented")
    }

    override fun getWorkInfosForUniqueWorkFlow(uniqueWorkName: String): Flow<MutableList<WorkInfo>> {
        TODO("Not yet implemented")
    }

    override fun getWorkInfosForUniqueWork(uniqueWorkName: String): ListenableFuture<MutableList<WorkInfo>> {
        TODO("Not yet implemented")
    }

    override fun getWorkInfosLiveData(workQuery: WorkQuery): LiveData<MutableList<WorkInfo>> {
        TODO("Not yet implemented")
    }

    override fun getWorkInfosFlow(workQuery: WorkQuery): Flow<MutableList<WorkInfo>> {
        TODO("Not yet implemented")
    }

    override fun getWorkInfos(workQuery: WorkQuery): ListenableFuture<MutableList<WorkInfo>> {
        TODO("Not yet implemented")
    }

    override fun updateWork(request: WorkRequest): ListenableFuture<UpdateResult> {
        TODO("Not yet implemented")
    }
}
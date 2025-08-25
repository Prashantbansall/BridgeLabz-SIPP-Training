Q2. Job Scheduler

CLASS Job
    ATTRIBUTE jobId
    ATTRIBUTE deadline
    ATTRIBUTE processingTime

    METHOD constructor(id, deadline, time)
        jobId <- id
        deadline <- deadline
        processingTime <- time
    END METHOD
END CLASS

CLASS JobScheduler
    ATTRIBUTE jobQueue

    METHOD constructor()
        jobQueue <- new PriorityQueue
    END METHOD

    METHOD addJob(job)
        jobQueue.insert(job)
    END METHOD

    METHOD scheduleJobs()
        WHILE jobQueue is not empty
            job <- jobQueue.remove()
            PRINT "Processing Job: " + job.jobId + " | Deadline: " + job.deadline
        END WHILE
    END METHOD
END CLASS

MAIN
    scheduler <- new JobScheduler()
    scheduler.addJob( Job("J1", 3, 10) )
    scheduler.addJob( Job("J2", 1, 5) )
    scheduler.addJob( Job("J3", 2, 2) )

    scheduler.scheduleJobs()
END MAIN


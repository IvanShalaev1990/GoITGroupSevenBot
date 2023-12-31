package com.goitgroupsevenbot.service.jobs;

import com.goitgroupsevenbot.service.TelegramBot;
import org.quartz.*;

/**
 * Class for sending notification.
 *
 * @author Abramov Artem
 * @version 1.0.0 28.10.2023
 */

public class NewsletterJob implements Job {
    @Override
    public void execute(JobExecutionContext jobExecutionContext) {
        SchedulerContext schedulerContext;
        try {
            schedulerContext = jobExecutionContext.getScheduler().getContext();
        } catch (SchedulerException e) {
            throw new RuntimeException(e);
        }

        TelegramBot bot = (TelegramBot) schedulerContext.get("bot");
        bot.sendNotification();

    }

}

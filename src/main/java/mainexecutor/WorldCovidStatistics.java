package mainexecutor;

import org.telegram.telegrambots.api.methods.send.SendMessage;
import org.telegram.telegrambots.api.objects.Update;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.exceptions.TelegramApiException;

public class WorldCovidStatistics extends TelegramLongPollingBot {

    public void onUpdateReceived(Update update) {
        String command = update.getMessage().getText();
        SendMessage message = new SendMessage();
        message.setChatId(update.getMessage().getChatId());
        message.setText("ho cambiato messaggio");
//        if (command.equals("/myname")) {
//            System.out.println(update.getMessage().getFrom().getFirstName());
//            message.setText(update.getMessage().getFrom().getFirstName());
//        }
//        if (command.equals("/mylastname")) {
//            System.out.println(update.getMessage().getFrom().getLastName());
//            message.setText(update.getMessage().getFrom().getLastName());
//        }
//        if (command.equals("/myfullname")) {
//            System.out.println(update.getMessage().getFrom().getFirstName() + " " + update.getMessage().getFrom().getLastName());
//            message.setText(update.getMessage().getFrom().getFirstName() + " " + update.getMessage().getFrom().getLastName());
//        }
        try {
            execute(message);
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
    }

    public String getBotUsername() {
        return "WorldCovidStatisticsBot";
    }

    public String getBotToken() {
        return "1064512093:AAF3HVlZS-zaeEXQFuFeEOHxkoGtBlBZpGM";
    }

}

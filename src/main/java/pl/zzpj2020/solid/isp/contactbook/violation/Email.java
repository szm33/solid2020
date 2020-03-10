package pl.zzpj2020.solid.isp.contactbook.violation;

public interface Email {
    void sendMessage(Contact emailable, String subject, String body);
}

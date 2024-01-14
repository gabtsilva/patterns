package domain;

public interface Observer {
    public void update(String line);
    public void end();
}

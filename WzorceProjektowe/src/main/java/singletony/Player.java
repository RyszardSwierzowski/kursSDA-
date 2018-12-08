package singletony;

import java.io.IOException;

/*
Stwórz klasę Player która będzie posiadać metody play, pause, stop oraz load i reset. Gdy
treść nie jest załadowana wówczas nie można wykonać innych metod (pole isLoad).
Podczas wykonywania metod wypisuj jaka metoda została wywołana - log powinien
zawierać tag z konfiguracji.
 */
public class Player {
    private boolean isLoad;

    private String prepareLog(String name) throws IOException {
        return ConfigHelper.getInstance().getConfig("log.tag") + " wykonano metode " + name;
    }

    public void play() throws IOException {
        if (isLoad) {
            System.out.println(prepareLog("PLAY"));
        }else{
            System.out.println(" Nie wykonano PLAY bo isLoad=false");
        }
    }

    public void pause() throws IOException {
        if (isLoad) {
            System.out.println(prepareLog("PAUSE"));
        }else{
            System.out.println(" Nie wykonano PAUSE bo isLoad=false");
        }

    }

    public void stop() throws IOException {
        if (isLoad) {
            System.out.println(prepareLog("STOP"));
        }else{
            System.out.println(" Nie wykonano STOP bo isLoad=false");
        }
    }

    public void load() {
        isLoad = true;
        System.out.println("Załadowano materiał");
    }

    public void reset() {
        isLoad = false;
        System.out.println("Usunięto materiał z odtwarzacza");
    }




}

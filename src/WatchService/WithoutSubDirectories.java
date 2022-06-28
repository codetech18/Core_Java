package WatchService;

import java.nio.file.*;

public class WithoutSubDirectories {
    public static void main(String[] args) {
        Path path = Paths.get("C:\\JAVA");

        try(WatchService watchService = FileSystems.getDefault().newWatchService()) {
            WatchKey key = path.register(watchService,
                    StandardWatchEventKinds.ENTRY_CREATE,
                    StandardWatchEventKinds.ENTRY_MODIFY,
                    StandardWatchEventKinds.ENTRY_DELETE);
            startListening(watchService);


        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("Completed");
    }

    private static void startListening(WatchService watchService) throws InterruptedException {
        while (true){
            WatchKey queuedKey = watchService.take();
            for (WatchEvent<?> watchEvent : queuedKey.pollEvents()){
                System.out.printf("kind=%s, count=%d,context=%s Context type=%s%n ",
                        watchEvent.kind(),
                        watchEvent.count(),
                        watchEvent.context(),
                        ((Path) watchEvent.context()).getClass());

                if (!queuedKey.reset()){
                    break;
                }
            }
        }
    }
}

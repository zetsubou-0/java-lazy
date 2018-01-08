package session.forothersessions.multithreading;

/**
 * Created by Valiktorus on 08.01.2018.
 */
public class Multithreading {
     /*
                        Создание потока:
        1) имплементить Runnable
            class Run implements Runnable{
                @Override
                public void run(){do something}
            }
            Thread thread = new Thread(new Run());
            thread.start; //запустит поток. Если вызвать run поток не запустится,а просто выполится действие
        2) расширить Thread
           class MyThread extends Thread{
                @Override
                public void run(){do something}
            }
            Thread thread = new MyThread();
            thread.start;

                        Жизненный цикл потока:
        1)NEW - создан, но не запущен
        2)RUNNABLE - выполняется
        3)BLOCKED - блокирован
        4)WAITING - ждёт окончания другого потока. Переходит при вызове методов join(), wait(), suspend()(deprecated)
        5)TIME_WAITING - ждёт некоторое время окончания потока Переходит при вызове методов yield(), sleep(long millis),
                            join(long millis), wait(long millis)
        6)TERMINATED - завершён
        thread.getState() - получить состояние

                        Приоритет потоков
        Можно задать приоритет выолнения потока от 1 до 10;
        thread.setPriority(Thread.MAX_PRIORITY) // 10

        Поток может входить в группу потоков с одним приоритетом
        ThreadGroup group = new ThreadGroup("groupName");
        Thread thread = newThread(group, "threadName");
        При добавлении в группу, если приоритет был выше, он уменьшается до приоритета группы, а если меньше, то не изменяется

                        Управление потоками
        Thread.sleep(int millis)  - приостановить выполнение потока на определённое количество милисекунд
        Thread.yield() - сделать паузу, позволяя другим захватить монитор(не рекомендуется)
        thread.join() - блокирует работу потока в котором вызван, до окончания потока на котором вызвали(thread);
        thread.join(int millis) - то же,что и прошлое, но не более millis милисекунд

    */

}

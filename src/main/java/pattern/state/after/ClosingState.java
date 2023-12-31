package pattern.state.after;


/**
 * 电梯关闭状态类
 */
public class ClosingState extends LiftState{




    @Override
    public void open() {
        super.context.setLiftState(Context.OPENING_STATE);
        super.context.open();

    }

    @Override
    public void close() {
        //
        System.out.println("电梯关闭了～");
    }

    @Override
    public void run() {
        super.context.setLiftState(Context.RUNNING_STATE);
        super.context.run();
    }

    @Override
    public void stop() {
        // do nothing
        super.context.setLiftState(Context.STOPPING_STATE);
        super.context.stop();
    }
}

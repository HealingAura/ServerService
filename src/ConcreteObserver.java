

public class ConcreteObserver extends FileObserver {



    public ConcreteFile m_ConcreteFile;

    public ConcreteObserver()
    {

    }

    public void finalize() throws Throwable
    {
        super.finalize();
    }

    @Override
    public void Update()
    {
    }

}
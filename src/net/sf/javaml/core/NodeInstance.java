package net.sf.javaml.core;

public class NodeInstance extends DenseInstance{
	
	int instanceId;

	public NodeInstance(int size,int id) {
		super(size);
		instanceId = id;
		// TODO Auto-generated constructor stub
	}

    public NodeInstance(double[] att,int id) {
        super(att, null);
        instanceId = id;
    }
    
    public int getInstanceId()
    {
    	return instanceId;
    }
    
    public int getID()
    {
    	return instanceId;
    }
}

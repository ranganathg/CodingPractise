package rangag.practise.sfint;

public class Application
{
	String ApplicationName;
	String path;
	@Override
	public int hashCode()
	{
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((ApplicationName == null) ? 0 : ApplicationName.hashCode());
		result = prime * result + ((path == null) ? 0 : path.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj)
	{
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Application other = (Application) obj;
		if (ApplicationName == null)
		{
			if (other.ApplicationName != null)
				return false;
		} else if (!ApplicationName.equals(other.ApplicationName))
			return false;
		if (path == null)
		{
			if (other.path != null)
				return false;
		} else if (!path.equals(other.path))
			return false;
		return true;
	}
}

#include <iostream>
#include <string>

using namespace std;

class Logger {
	static Logger* _Instance;
	std::string text;
	std::string moduleName;

	Logger() : text("Enabling the logging") , moduleName("default") {}

public:
	static Logger* getInstance()
	{
		if (_Instance == NULL)
			_Instance = new Logger();
		return _Instance;		
	}

	void SetCurrentModule(std::string name)
	{
		moduleName = name;
	}

	std::string GetCurrentModule()
	{
		return moduleName;
	}

	void printDetails()
	{
		cout << text << " : " << GetCurrentModule() << endl;;
	}
};

Logger* Logger::_Instance = NULL;

int main()
{
	Logger* enableLogs = Logger::getInstance();
	enableLogs->printDetails();
	enableLogs->SetCurrentModule(" Module 1");
	enableLogs->printDetails();

	enableLogs->SetCurrentModule(" Module 2");
	enableLogs->printDetails();

	//Logger obj; compiler error
	return 0;
}

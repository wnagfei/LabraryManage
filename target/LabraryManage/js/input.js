// JavaScript Document
// author : heyq

	//ǿ����������
	function forceIntoNumber()
	{
		var asc_0 = "0".charCodeAt(0);
		var asc_9 = "9".charCodeAt(0);
		var keyCode = window.event.keyCode;

		if ((keyCode < asc_0 || keyCode > asc_9))
			window.event.keyCode = 0;
	}
	
	//ǿ������绰����
	function forceIntoTelNumber()
	{
		var asc_0 = "0".charCodeAt(0);
		var asc_9 = "9".charCodeAt(0);
		var asc_space = " ".charCodeAt(0);
		var asc_line = "-".charCodeAt(0);
	
		var keyCode = window.event.keyCode;

		if ((keyCode < asc_0 || keyCode > asc_9) &&
			 keyCode != asc_space &&
			 keyCode != asc_line)
			window.event.keyCode = 0;
	}
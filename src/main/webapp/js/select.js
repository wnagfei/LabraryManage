//-----------------------------------------�����б��Զ�ѡ��------------------------------------------------------------
/**����:�����б����������ֵ�Զ�ѡ��
*����:sel_element:�����б���hid_element��������hid_element
*���ߣ�������
*/
	function SelectInd(sel_element,hid_element){
	for(i=0;i<(sel_element.length);i++){
	if(sel_element.options[i].value==hid_element.value){
	sel_element.selectedIndex=i;
	break;
	}
	}
	}
	
	/**����:�����б����������ֵ�Զ�ѡ��
*����:sel_element:�����б���hid_element��������ֵhid_element_value
*/
	function SelectInd(sel_element,hid_element_value){
	for(i=0;i<(sel_element.length);i++){
	if(sel_element.options[i].value==hid_element_value){
	sel_element.selectedIndex=i;
	break;
	}
	}
	}
	//-----------------------------------------�����б��Զ�ѡ�����------------------------------------------------------------
	
	
	//--------------------------------------------------select���ɾ����---------------------------------------------------
	/**
	*@description���õ�ǰ��selectObj����
	*/

	/**
	*@description:���selectObj���Ƿ����data,�Է�ֹ�����ظ�����
	@param data,��������
	@return ���ڷ���false,�����ڷ���true
	*/
	function checkSelectData(selectObj,data) {

   
  var index = selectObj.length;
  var i=0;
  for(i=0;i<index;i++){
    if(selectObj.options[i].value==data){
      return false;
    }
  }
  return true;
}

	/**
	*@description:��������ӵ�selectObj��
	@param dataValue,selectObj option��valueֵ
	@param dataText,selectObj option��textֵ
	
	*/

function addSelectData(selectObj,dataValue,dataText) {
   var newItem = new Option(  dataText,dataValue, false, false );
   var index = selectObj.length;
   selectObj.options[index] = newItem;
}

//ɾ���б���ѡ����ֵ
function del(selectObj){
    try{
        if(selectObj.length>0)
        selectObj.remove(selectObj.selectedIndex);   
    }catch(e){}
}

//ɾ������
function delAll(selectObj){
    for (i=0;i<selectObj.length;){
        selectObj.remove(i);
    }
}
/**
 * ��һ���б��ƶ�����һ���б�
 * fbox Դ�б�
 * tbox Ŀ���б�
 * isAll �Ƿ�ȫ�ƶ���falseֻ�ƶ���ѡ�е�
 * */
function move(fbox,tbox,isAll) {
    for(var i=0; i<fbox.options.length;) {
    	var isMove = false;
    	if(isAll == true){
    	    isMove = true;
    	}else{
    		isMove = fbox.options[i].selected;
    	}
     if(isMove) {
       var no = new Option();
       no.value = fbox.options[i].value;
       no.text = fbox.options[i].text;
       tbox.options[tbox.options.length] = no;
       fbox.remove(i);   
     }else{
    	 i++;
     }
   }
}

function selectAll(selectObj){
	 for(var i=0;i<selectObj.length;i++){
		 selectObj.options[i].selected = true;
       }
}

//--------------------------------select���ɾ�������--------------------------------------------------------------
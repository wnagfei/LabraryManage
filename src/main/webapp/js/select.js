//-----------------------------------------下拉列表自动选择------------------------------------------------------------
/**功能:下拉列表根据隐藏域值自动选择
*参数:sel_element:下拉列表名hid_element：隐藏域hid_element
*作者：廖先毅
*/
	function SelectInd(sel_element,hid_element){
	for(i=0;i<(sel_element.length);i++){
	if(sel_element.options[i].value==hid_element.value){
	sel_element.selectedIndex=i;
	break;
	}
	}
	}
	
	/**功能:下拉列表根据隐藏域值自动选择
*参数:sel_element:下拉列表名hid_element：隐藏域值hid_element_value
*/
	function SelectInd(sel_element,hid_element_value){
	for(i=0;i<(sel_element.length);i++){
	if(sel_element.options[i].value==hid_element_value){
	sel_element.selectedIndex=i;
	break;
	}
	}
	}
	//-----------------------------------------下拉列表自动选择结束------------------------------------------------------------
	
	
	//--------------------------------------------------select添加删除项---------------------------------------------------
	/**
	*@description设置当前的selectObj对象
	*/

	/**
	*@description:检查selectObj中是否包含data,以防止出现重复数据
	@param data,检查的数据
	@return 存在返回false,不存在返回true
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
	*@description:将数据添加到selectObj中
	@param dataValue,selectObj option的value值
	@param dataText,selectObj option的text值
	
	*/

function addSelectData(selectObj,dataValue,dataText) {
   var newItem = new Option(  dataText,dataValue, false, false );
   var index = selectObj.length;
   selectObj.options[index] = newItem;
}

//删除列表中选定的值
function del(selectObj){
    try{
        if(selectObj.length>0)
        selectObj.remove(selectObj.selectedIndex);   
    }catch(e){}
}

//删除所有
function delAll(selectObj){
    for (i=0;i<selectObj.length;){
        selectObj.remove(i);
    }
}
/**
 * 从一个列表移动到另一个列表
 * fbox 源列表
 * tbox 目标列表
 * isAll 是否全移动，false只移动被选中的
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

//--------------------------------select添加删除项结束--------------------------------------------------------------
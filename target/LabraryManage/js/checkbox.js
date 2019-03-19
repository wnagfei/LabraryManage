

/**
*@description:获取指定checkboxObj的值
*@param flag:ture表示取得被选中的checkboxObj的值,false表示取得未被选中的checkbox的值
*@param checkBoxName：checkbox的name值
*@param seperator:返回值各值之间的分隔符
*@return:返回取得的值组成的字符串,由seperator去分隔
**/
function getCheckBoxValues(checkboxObj,seperator,flag){

    var returnVal = "";
    //--------------param validate-----------------------------
        if (flag!=true&&(flag!=false)){
            alert("flag must be ture or flase");
            return ;
        }
        
    if ((checkboxObj.length==undefined)&&(checkboxObj.checked==flag)){//只有一个选框
        return checkboxObj.value;
    }else{
  
    	//--------------param validate-----------------------------
        for (i=0;i<checkboxObj.length;i++){

                if (checkboxObj[i].checked==flag){//need name
                   returnVal += seperator+checkboxObj[i].value;
                }
        }
        
        if (returnVal.length>0){
            returnVal = returnVal.substring(seperator.length);
        }
        
        return returnVal;
    }

}

/**
*全选,全不选
@checkboxObj 复选框对象
@flag判断是全选还是全不选 true 全选 false 全不选
*/
function checkAll(checkboxObj,flag){
    
    //--------------param validate-----------------------------
        if (flag!=true&&(flag!=false)){
            alert("flag must be ture or flase");
            return ;
        }
    
    if (checkboxObj.length=='undefined'||checkboxObj.length==undefined){//只有一个选框
       
        checkboxObj.checked = flag;
       
    }

    //--------------param validate-----------------------------
    for (i=0;i<checkboxObj.length;i++){

           checkboxObj[i].checked=flag;
    }
}
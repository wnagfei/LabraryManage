

/**
*@description:��ȡָ��checkboxObj��ֵ
*@param flag:ture��ʾȡ�ñ�ѡ�е�checkboxObj��ֵ,false��ʾȡ��δ��ѡ�е�checkbox��ֵ
*@param checkBoxName��checkbox��nameֵ
*@param seperator:����ֵ��ֵ֮��ķָ���
*@return:����ȡ�õ�ֵ��ɵ��ַ���,��seperatorȥ�ָ�
**/
function getCheckBoxValues(checkboxObj,seperator,flag){

    var returnVal = "";
    //--------------param validate-----------------------------
        if (flag!=true&&(flag!=false)){
            alert("flag must be ture or flase");
            return ;
        }
        
    if ((checkboxObj.length==undefined)&&(checkboxObj.checked==flag)){//ֻ��һ��ѡ��
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
*ȫѡ,ȫ��ѡ
@checkboxObj ��ѡ�����
@flag�ж���ȫѡ����ȫ��ѡ true ȫѡ false ȫ��ѡ
*/
function checkAll(checkboxObj,flag){
    
    //--------------param validate-----------------------------
        if (flag!=true&&(flag!=false)){
            alert("flag must be ture or flase");
            return ;
        }
    
    if (checkboxObj.length=='undefined'||checkboxObj.length==undefined){//ֻ��һ��ѡ��
       
        checkboxObj.checked = flag;
       
    }

    //--------------param validate-----------------------------
    for (i=0;i<checkboxObj.length;i++){

           checkboxObj[i].checked=flag;
    }
}
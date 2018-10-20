package highlevel

import groovy.json.JsonOutput
import groovy.json.JsonSlurper
import objectorention.Person

/**
 * Created by 董乐强 on 2018/10/19.
 */

/*//将arrayList转换为json
def list = [new Person(name:'John',age:25),
            new Person(name:'Major',age:26)
]

def json= JsonOutput.toJson(list)
//格式化json
println JsonOutput.prettyPrint(json)

def jsonSlurper = new JsonSlurper()

jsonSlurper.parse()*/


//小案例
//解析json
def response = getNetworkData('http://www.baidu.com')

println response.data.head.name
def getNetworkData(String url){
    //发送http请求
    def connection = new URL(url).openConnection()
    connection.setRequestMethod('GET')
    connection.connect()

    def response = connection.content.text
    println response
    //将json转换为实体对象
    def jsonSluper = new JsonSlurper()
    return jsonSluper.parseText(response)
}


//对xml文件处理详解: 使用groovy创建xml,解析xml文件

def xmlSluper = new XmlSlurper()
def response1 = xmlSluper.parseText(xml)
















#0x01
    工程根目录文件build.gradle节点:
        root->allprojects->repositories
        追加
             maven { url 'https://www.jitpack.io' }
#0x02
    checkout ddcompact工程
    方式通过as导入lib工程
    也可以可以copy到主工程
    copy步骤如下:
        1. settings.gradle节点:
           追加
           include ':ddcompact',':ddcompact:DDMain'
        2. 主工程(京麦)
            1. build.gradle
               追加
               compile project(':ddcompact')

#0x03
    主工程(京麦) Application->onCreate调用DDApp.onCreate(this);


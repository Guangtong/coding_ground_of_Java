<!DOCTYPE html>  
<html>  
<head>  
<meta http-equiv="content-type" content="text/html; charset=utf-8" />
<title><?php echo $title ?></title>
<link rel="shortcut icon" href="http://codingground.tutorialspointin.netdna-cdn.com/images/favicon.ico" type="image/x-icon" />
<meta name="Description" content="<?php echo $title ?> - Experience the best cloud computing where you can edit, compile, execute and share your varities of projects with the help of simple clicks. You can save your projects at Dropbox, GitHub, GoogleDrive and OneDrive to be accessed anywhere and any time. We support almost all the popular programming languages including Java, JSP, Cold Fusion, C, C++, Pascal, Fortran, PHP, Perl, Ruby, Python and many more other programming languages using your browsers, iPhones, iPads or any other online device like smart TV." />
<meta name="Keywords" content="compile, execute, programs, online, linux, experience, cloud, computing, source code, dropbox, googledrive, onedrive, programming, java, jsp, cold fusion, c, c++, pascal, fortran, php, perl, ruby, python, browsers, iphones, ipads, smart tv."/>
<link rel="shortcut icon" href="/favicon.ico" type="image/x-icon" />
<base href="http://www.tutorialspoint.com" />
<script src="codingground/scripts/jquery.min.js"></script>
<script src="codingground/scripts/jquery.easyui.min.js"></script>
<script src="codingground/ace/src-min/ace.js" type="text/javascript" charset="utf-8"></script>
<script src="codingground/scripts/spectrum.js"></script>
<link rel="stylesheet" type="text/css" href="codingground/themes/gray/easyui.css">
<link rel="stylesheet" type="text/css" href="codingground/themes/icon.css">
<link rel="stylesheet" type="text/css" href="codingground/style/spectrum.css">
<link rel="stylesheet" type="text/css" href="codingground/style/cg.css">
<script src="codingground/node_modules/socket.io/node_modules/socket.io-client/dist/socket.io.js"></script>
<script src="codingground/node_modules/term.js/src/term.js"></script>
<script src="http://codingground.tutorialspoint.com:5000/scripts/cg.js"></script>
<script src="http://www.google-analytics.com/urchin.js" type="text/javascript">
</script>
<script type="text/javascript">
/*
<?php
echo "var port = $port;\n";
echo "var sessionid = \"$sessionid\";\n";
?>
*/
var port = 5000;
var sessionid = "12345";
var HOME="http://codingground.tutorialspoint.com";
$(window).load(function() {
   var eh = $('#east').outerHeight();
   var sh = $('#south').outerHeight();
   var h = eh + sh + 48 - 520;
});
function shutdown() {
   $.messager.defaults.ok = "Yes";
   $.messager.defaults.cancel = "No";
   $.messager.confirm('Confirmation','Do you really want to shut down the system?', function(r){
      if (r){
         // Make Ajax call to redirect to dropbox
         var url = HOME + ':'  + port + '/shut_down?port=' + port + "&sessionid=" + sessionid;
         var inputs = {"hello":"bye"};
         $.ajax({
            type: "GET",
            url: url,
            data: inputs,
            dataType: 'json',
            beforeSend: function(  ) {
               $("#loading").css({"visibility":"visible"});
            },
            success: function(data){
           }
         });
         window.onbeforeunload = null;
         $("#loading").css({"visibility":"hidden"});
         window.location = "http://codingground.tutorialspoint.com";
      }
   });
}
</script>
<script type="text/javascript">
_uacct = "UA-32077377-1";
urchinTracker();
</script>
<!-- Go to www.addthis.com/dashboard to customize your tools -->
<script type="text/javascript" src="//s7.addthis.com/js/300/addthis_widget.js#pubid=ra-54672887315b1ff2" async="async"></script>
</head>
<body class="easyui-layout" id="cc">
<div id="loading"></div>
<form id="ff">
<div id="sign" class="easyui-window" title="Coding Ground" data-options="iconCls:'icon-login',modal:true, maximizable:false, closed:true, minimizable:false" style="width:530px;height:475px;padding:10px;"></div>
<div id="dircontext" class="easyui-menu" style="width:150px;">
   <div onclick="newFile()" data-options="iconCls:'icon-add-file'">Create File</div>
   <div onclick="saveFiles( function( status ){ return true; })" data-options="iconCls:'icon-save-project'">Save Files</div>
   <div onclick="openFileUpload()" data-options="iconCls:'icon-upload-file'">Upload File</div>
   <div onclick="newDir()" data-options="iconCls:'icon-add-dir'">New Directory</div>
   <div onclick="deleteDir()" data-options="iconCls:'icon-delete-file'">Delete Directory</div>
   <div onclick="renameFile()" data-options="iconCls:'icon-rename-file'">Rename Directory</div>
   <div onclick="reloadTree()" data-options="iconCls:'icon-refresh-project'">Refresh Files</div>
</div>
<div id="filecontext" class="easyui-menu" style="width:150px;">
   <div onclick="loadFile(false, false)" data-options="iconCls:'icon-save-file'">Open File</div>
   <div onclick="saveFiles( function( status ){ return true; })" data-options="iconCls:'icon-save-project'">Save File</div>
   <div onclick="deleteFile()" data-options="iconCls:'icon-delete-file'">Delete File</div>
   <div onclick="renameFile()" data-options="iconCls:'icon-rename-file'">Rename File</div>
   <div onclick="downloadFile()" data-options="iconCls:'icon-download-file'">Download File</div>
   <div onclick="reloadTree()" data-options="iconCls:'icon-refresh-project'">Refresh Files</div>
</div>
<iframe id="download" style="display:hidden"></iframe>
<div data-options="region:'north'" style="height:50px; background:url(/images/top_bg.png) repeat-x !important;"><!--HEADER STARTS -->
 <div class="easyui-panel,border:false,doSize:false" style="padding:5px; padding-top:7px;">
   <a href="http://www.tutorialspoint.com/codingground.htm"><img src="/images/logo.png" style="height:30px;margin-left:5px;border:0px;position:relative; top:-2px"/></a><span id="title" style="position:relative; font-size:14px; top:-12px;"><?php echo $title ?></span> <span id="version" style="position:relative; font-size:14px; top:-12px;"></span>
   <a id="help" href="#" class="easyui-linkbutton" data-options="iconCls:'icon-help', plain:true" style="float:right">Help</a>
   <a id="tutorials" target="_blank" href="http://www.tutorialspoint.com/tutorialslibrary.htm" class="easyui-linkbutton" data-options="iconCls:'icon-library', plain:true" style="float:right; position:relative; top:-1px;">Tutorials</a>
   <a id="view" href="#" class="easyui-menubutton" data-options="menu:'#mm3',iconCls:'icon-view'" style="float:right">View</a>
   <a id="edit" href="#" class="easyui-menubutton" data-options="menu:'#mm2',iconCls:'icon-edit'" style="float:right">Edit</a>
   <a id="project" href="#" class="easyui-menubutton" data-options="menu:'#mm4', plain:true, iconCls:'icon-project'" style="float:right">Project</a>
   <a id="edit" href="#" class="easyui-menubutton" data-options="menu:'#mm1', iconCls:'icon-file'" style="float:right">File</a>
   <a id="system" href="#" class="easyui-menubutton" data-options="menu:'#mm5', plain:true,iconCls:'icon-compileonline'" style="float:right">System</a>
</div>
<div id="mm5" style="width:200px;">
   <div onclick="window.open('http://www.tutorialspoint.com/about/index.htm')" id="about" data-options="plain:true, iconCls:'icon-about'">About</div>
   <div class="menu-sep"></div>
   <div onclick="shutdown()" data-options="plain:true, iconCls:'icon-exit'">Shut Down</div>
   <div class="menu-sep"></div>
   <div id="codingground" data-options="plain:true, iconCls:'icon-home'">Coding Ground</div>
   <div class="menu-sep"></div>
   <div onclick="window.open('http://www.tutorialspoint.com/tutorialslibrary.htm')" data-options="plain:true, iconCls:'icon-library'">Tutorials Library</div>
   <div class="menu-sep"></div>
   <div onclick="openContact()" data-options="plain:true, iconCls:'icon-email'">Contact Coding Ground</div>
   <div class="menu-sep"></div>
   <div class="addthis_sharing_toolbox" data-options="iconCls:'icon-share-project'"></div>
</div>
<div id="mm1" style="width:200px;">
   <div onclick="newFile()" data-options="iconCls:'icon-add-file'">Create File</div>
   <div onclick="saveFiles( function( status ){ return true; })" data-options="iconCls:'icon-save-project'">Save Files</div>
   <div onclick="deleteFile()" data-options="iconCls:'icon-delete-file'">Delete File</div>
   <div onclick="renameFile()" data-options="iconCls:'icon-rename-file'">Rename File</div>
   <div onclick="downloadFile()" data-options="iconCls:'icon-download-file'">Download File</div>
   <div onclick="openFileUpload()" data-options="iconCls:'icon-upload-file'">Upload File</div>
   <div class="menu-sep"></div>
   <div onclick="newDir()" data-options="iconCls:'icon-add-dir'">New Directory</div>
   <div onclick="deleteDir()" data-options="iconCls:'icon-delete-file'">Delete Directory</div>
   <div onclick="renameFile()" data-options="iconCls:'icon-rename-file'">Rename Directory</div>
</div>
<div id="mm2" style="width:200px;">
   <div id="undo" data-options="iconCls:'icon-undo'">Undo</div>
   <div id="redo" data-options="iconCls:'icon-redo'">Redo</div>
   <div class="menu-sep"></div>
   <div id="cut" data-options="iconCls:'icon-cut'">Cut</div>
   <div id="copy" data-options="iconCls:'icon-copy'">Copy</div>
   <div id="paste" data-options="iconCls:'icon-paste'">Paste</div>
   <div id="delete" data-options="iconCls:'icon-delete'">Delete</div>
   <div id="select" data-options="iconCls:'icon-select'">Select All</div>
   <div class="menu-sep"></div>
   <div id="find" data-options="iconCls:'icon-find'">Find</div>
   <div id="findreplace" data-options="iconCls:'icon-replace'">Find and Replace</div>
</div>
<div id="mm3" style="width:200px;">
<!--
   <div id="editor-type" data-options="iconCls:'icon-editor-type'"><span>Editor Type</span>
          <div>
                <div onclick="setEditorType('ace');">Ace</div>
                <div onclick="setEditorType('vim');">Vim</div>
                <div onclick="setEditorType('emacs');">Emacs</div>
         </div>
   </div>
-->
   <div id="editor-theme" data-options="iconCls:'icon-editor-theme'"><span>Editor Theme</span>
           <div>
                <div onclick="setEditorTheme('chrome');">Chrome</div>
                <div onclick="setEditorTheme('crimson_editor');">Crimson Editor</div>
                <div onclick="setEditorTheme('dreamweaver');">Dreamweaver</div>
                <div onclick="setEditorTheme('eclipse');">Eclipse</div>
                <div onclick="setEditorTheme('github');">Github</div>
                <div onclick="setEditorTheme('kuroir');">Kuroir</div>
                <div onclick="setEditorTheme('solarized_light');">Solarized Light</div>
                <div onclick="setEditorTheme('solarized_dark');">Solarized Dark</div>
                <div onclick="setEditorTheme('xcode');">XCode</div>
                <div onclick="setEditorTheme('ambiance');">Ambiance</div>
                <div onclick="setEditorTheme('cobalt');">Cobalt</div>
                <div onclick="setEditorTheme('idle_fingers');">idle Fingers</div>
                <div onclick="setEditorTheme('kr_theme');">krTheme</div>
                <div onclick="setEditorTheme('mono_industrial');">Mono Industrial</div>
                <div onclick="setEditorTheme('monokai');">Monokai</div>
                <div onclick="setEditorTheme('terminal');">Terminal</div>
                <div onclick="setEditorTheme('textmate');">Textmate</div>
                <div onclick="setEditorTheme('tomorrow');">Tomorrow</div>
                <div onclick="setEditorTheme('twilight');">Twilight</div>
                <div onclick="setEditorTheme('vibrant_ink');">Vibrant Ink</div>
            </div>
   </div>
   <div id="font-size" data-options="iconCls:'icon-font-size'"><span>Font Size</span>
            <div>
                <div onclick="setEditorFontSize('8');">8px</div>
                <div onclick="setEditorFontSize('9');">9px</div>
                <div onclick="setEditorFontSize('10');">10px</div>
                <div onclick="setEditorFontSize('11');">11px</div>
                <div onclick="setEditorFontSize('12');">12px</div>
                <div onclick="setEditorFontSize('13');">13px</div>
                <div onclick="setEditorFontSize('14');">14px</div>
                <div onclick="setEditorFontSize('15');">15px</div>
                <div onclick="setEditorFontSize('16');">16px</div>
                <div onclick="setEditorFontSize('17');">17px</div>
                <div onclick="setEditorFontSize('18');">18px</div>
                <div onclick="setEditorFontSize('20');">20px</div>
                <div onclick="setEditorFontSize('22');">22px</div>
                <div onclick="setEditorFontSize('24');">24px</div>
            </div>
   </div>
   <div id="tab-size" data-options="iconCls:'icon-tab-size'"><span>Tab Size</span>
            <div>
                <div onclick="setEditorTabSize('1');">1</div>
                <div onclick="setEditorTabSize('2');">2</div>
                <div onclick="setEditorTabSize('3');">3</div>
                <div onclick="setEditorTabSize('4');">4</div>
                <div onclick="setEditorTabSize('5');">5</div>
                <div onclick="setEditorTabSize('6');">6</div>
                <div onclick="setEditorTabSize('7');">7</div>
                <div onclick="setEditorTabSize('8');">8</div>
            </div>
   </div>
   <div id="soft-wrap" data-options="iconCls:'icon-soft-wrap'"><span>Soft Wrap</span>
            <div>
                <div onclick="setEditorSoftWrap('true');">On</div>
                <div onclick="setEditorSoftWrap('false');">Off</div>
                <div onclick="setEditorSoftWrap('40');">40 Chars</div>
                <div onclick="setEditorSoftWrap('60');">60 Chars</div>
                <div onclick="setEditorSoftWrap('80');">80 Chars</div>
                <div onclick="setEditorSoftWrap('100');">100 Chars</div>
                <div onclick="setEditorSoftWrap('120');">120 Chars</div>
                <div onclick="setEditorSoftWrap('140');">140 Chars</div>
            </div>
   </div>
   <div class="menu-sep"></div>
   <div onclick="setEditorInvisible(true);"  data-options="iconCls:'icon-show-invisible'">Show Invisible</div>
   <div onclick="setEditorInvisible(false);" data-options="iconCls:'icon-hide-invisible'">Hide Invisible</div>
   <div class="menu-sep"></div>
   <div onclick="setEditorGutter(true);" data-options="iconCls:'icon-show-gutter'">Show Gutter</div>
   <div onclick="setEditorGutter(false);" data-options="iconCls:'icon-hide-gutter'">Hide Gutter</div>
</div>
<div id="mm4" style="width:200px;">
     <div data-options="iconCls:'icon-create-project'"><span>Create Project</span>
       <div>
          <div onclick="createProject('http://www.tutorialspoint.com/try_angularjs_online.php')">AngularJS</div>
          <div onclick="createProject('http://www.tutorialspoint.com/try_asciidoc_online.php')">AsciiDoc</div>
          <div onclick="createProject('http://www.tutorialspoint.com/try_bootstrap_online.php')">Bootstrap</div>
          <div onclick="createProject('http://www.tutorialspoint.com/try_css_online.php')">CSS</div>
          <div onclick="createProject('http://www.tutorialspoint.com/try_coffeescript_online.php')">CoffeeScript</div>
          <div onclick="createProject('http://www.tutorialspoint.com/try_html_online.php')">HTML</div>
          <div onclick="createProject('http://www.tutorialspoint.com/try_javascript_online.php')">Javascript</div>
          <div onclick="createProject('http://www.tutorialspoint.com/try_jquery_online.php')">jQuery</div>
          <div onclick="createProject('http://www.tutorialspoint.com/try_latex_online.php')">Latex</div>
          <div onclick="createProject('http://www.tutorialspoint.com/try_mathml_online.php')">MathML</div>
          <div onclick="createProject('http://www.tutorialspoint.com/try_markdown_online.php')">Markdown</div>
          <div onclick="createProject('http://www.tutorialspoint.com/try_restructure_online.php')">reStructure</div>
          <div onclick="createProject('http://www.tutorialspoint.com/compile_ada_online.php')">Ada</div>
          <div onclick="createProject('http://www.tutorialspoint.com/execute_algol_online.php')">Algol-68</div>
          <div onclick="createProject('http://www.tutorialspoint.com/compile_assembly_online.php')">Assembly</div>
          <div onclick="createProject('http://www.tutorialspoint.com/execute_awk_online.php')">Awk</div>
          <div onclick="createProject('http://www.tutorialspoint.com/execute_bash_online.php')">Bash</div>
          <div onclick="createProject('http://www.tutorialspoint.com/execute_basic_online.php')">Basic</div>
          <div onclick="createProject('http://www.tutorialspoint.com/compile_befunge_online.php')">Befunge</div>
          <div onclick="createProject('http://www.tutorialspoint.com/execute_brainfk_online.php')">Brainf**k</div>
          <div onclick="createProject('http://www.tutorialspoint.com/compile_c_online.php')">C</div>
          <div onclick="createProject('http://www.tutorialspoint.com/compile_c99_online.php')">C99</div>
          <div onclick="createProject('http://www.tutorialspoint.com/execute_clojure_online.php')">Clojure</div>
          <div onclick="createProject('http://www.tutorialspoint.com/compile_cobol_online.php')">Cobol</div>
          <div onclick="createProject('http://www.tutorialspoint.com/compile_cpp_online.php')">C++</div>
          <div onclick="createProject('http://www.tutorialspoint.com/compile_cpp0x_online.php')">C++0x</div>
          <div onclick="createProject('http://www.tutorialspoint.com/compile_cpp11_online.php')">C++11</div>
          <div onclick="createProject('http://www.tutorialspoint.com/compile_csharp_online.php')">C#</div>
          <div onclick="createProject('http://www.tutorialspoint.com/compile_d_online.php')">D Lang</div>
          <div onclick="createProject('http://www.tutorialspoint.com/execute_dart_online.php')">Dart</div>
          <div onclick="createProject('http://www.tutorialspoint.com/compile_embedded_c_online.php')">Embedded C</div>
          <div onclick="createProject('http://www.tutorialspoint.com/compile_erlang_online.php')">Erlang</div>
          <div onclick="createProject('http://www.tutorialspoint.com/compile_fsharp_online.php')">F#</div>
          <div onclick="createProject('http://www.tutorialspoint.com/execute_factor_online.php')">Factor</div>
          <div onclick="createProject('http://www.tutorialspoint.com/execute_falcon_online.php')">Falcon</div>
          <div onclick="createProject('http://www.tutorialspoint.com/execute_fantom_online.php')">Fantom</div>
          <div onclick="createProject('http://www.tutorialspoint.com/compile_freebasic_online.php')">Free Basic</div>
          <div onclick="createProject('http://www.tutorialspoint.com/execute_forth_online.php')">Forth</div>
          <div onclick="createProject('http://www.tutorialspoint.com/compile_fortran_online.php')">Fortran-95</div>
          <div onclick="createProject('http://www.tutorialspoint.com/execute_golang_online.php')">Go</div>
          <div onclick="createProject('http://www.tutorialspoint.com/execute_groovy_online.php')">Groovy</div>
          <div onclick="createProject('http://www.tutorialspoint.com/compile_haskell_online.php')">Haskell</div>
          <div onclick="createProject('http://www.tutorialspoint.com/execute_haxe_online.php')">Haxe</div>
          <div onclick="createProject('http://www.tutorialspoint.com/compile_icon_online.php')">Icon</div>
          <div onclick="createProject('http://www.tutorialspoint.com/compile_intercal_online.php')">Intercal</div>
          <div onclick="createProject('http://www.tutorialspoint.com/compile_ilasm_online.php')">ilasm</div>
          <div onclick="createProject('http://www.tutorialspoint.com/compile_java_online.php')">Java</div>
          <div onclick="createProject('http://www.tutorialspoint.com/compile_java8_online.php')">Java-8</div>
          <div onclick="createProject('http://www.tutorialspoint.com/execute_julia_online.php')">Julia</div>
          <div onclick="createProject('http://www.tutorialspoint.com/execute_lisp_online.php')">LISP</div>
          <div onclick="createProject('http://www.tutorialspoint.com/execute_lua_online.php')">Lua</div>
          <div onclick="createProject('http://www.tutorialspoint.com/execute_lolcode_online.php')">LOLCODE</div>
          <div onclick="createProject('http://www.tutorialspoint.com/execute_malbolge_online.php')">Malbolge</div>
          <div onclick="createProject('http://www.tutorialspoint.com/execute_matlab_online.php')">Matlab/Octave</div>
          <div onclick="createProject('http://www.tutorialspoint.com/compile_mozart-oz_online.php')">Mozart-OZ</div>
          <div onclick="createProject('http://www.tutorialspoint.com/compile_nimrod_online.php')">Nimrod</div>
          <div onclick="createProject('http://www.tutorialspoint.com/execute_nodejs_online.php')">Node.js</div>
          <div onclick="createProject('http://www.tutorialspoint.com/compile_objective-c_online.php')">Objective-C</div>
          <div onclick="createProject('http://www.tutorialspoint.com/compile_ocaml_online.php')">OCaml</div>
          <div onclick="createProject('http://www.tutorialspoint.com/execute_pari_online.php')">PARI/GP</div>
          <div onclick="createProject('http://www.tutorialspoint.com/compile_pascal_online.php')">Pascal</div>
          <div onclick="createProject('http://www.tutorialspoint.com/compile_pawn_online.php')">Pawn</div>
          <div onclick="createProject('http://www.tutorialspoint.com/execute_perl_online.php')">Perl</div>
          <div onclick="createProject('http://www.tutorialspoint.com/execute_php_online.php')">PHP</div>
          <div onclick="createProject('http://www.tutorialspoint.com/php_webview_online.php')">PHP</div>
          <div onclick="createProject('http://www.tutorialspoint.com/execute_prolog_online.php')">Prolog</div>
          <div onclick="createProject('http://www.tutorialspoint.com/execute_python_online.php')">Python</div>
          <div onclick="createProject('http://www.tutorialspoint.com/execute_python3_online.php')">Python-3</div>
          <div onclick="createProject('http://www.tutorialspoint.com/execute_rexx_online.php')">REXX</div>
          <div onclick="createProject('http://www.tutorialspoint.com/execute_r_online.php')">R Programming</div>
          <div onclick="createProject('http://www.tutorialspoint.com/execute_ruby_online.php')">Ruby</div>
          <div onclick="createProject('http://www.tutorialspoint.com/compile_rust_online.php')">Rust</div>
          <div onclick="createProject('http://www.tutorialspoint.com/compile_scala_online.php')">Scala</div>
          <div onclick="createProject('http://www.tutorialspoint.com/execute_scheme_online.php')">Scheme</div>
          <div onclick="createProject('http://www.tutorialspoint.com/compile_simula_online.php')">Simula</div>
          <div onclick="createProject('http://www.tutorialspoint.com/execute_smalltalk_online.php')">Smalltalk</div>
          <div onclick="createProject('http://www.tutorialspoint.com/execute_sql_online.php')">SQLite SQL</div>
          <div onclick="createProject('http://www.tutorialspoint.com/execute_smlnj_online.php')">SML/NJ</div>
          <div onclick="createProject('http://www.tutorialspoint.com/execute_scriptbasic_online.php')">ScriptBasic</div>
          <div onclick="createProject('http://www.tutorialspoint.com/execute_tcl_online.php')">Tcl</div>
          <div onclick="createProject('http://www.tutorialspoint.com/execute_ksh_online.php')">Ksh</div>
          <div onclick="createProject('http://www.tutorialspoint.com/execute_unlambda_online.php')">Unlambda</div>
          <div onclick="createProject('http://www.tutorialspoint.com/compile_vb.net_online.php')">VB.Net</div>
          <div onclick="createProject('http://www.tutorialspoint.com/compile_verilog_online.php')">Verilog</div>
          <div onclick="createProject('http://www.tutorialspoint.com/execute_whitespace_online.php')">Whitespace</div>
       </div>
     </div>
     <div onclick="refreshProject();" data-options="iconCls:'icon-refresh-project'">Refresh Project</div>
     <div onclick="renameProject();" data-options="iconCls:'icon-rename-file'">Rename Project</div>
     <div class="menu-sep"></div>
     <div data-options="iconCls:'icon-save-project'"><span>Save Project</span>
       <div>
           <div onclick="saveAtDropbox()" data-options="iconCls:'icon-dropbox'">Save at Dropbox</div>
           <div onclick="saveAtGithub()" data-options="iconCls:'icon-github'">Save at GitHub</div>
           <div onclick="saveAtGoogleDrive()" data-options="iconCls:'icon-google-drive'">Save at Google Drive</div>
           <div onclick="saveAtOneDrive()" data-options="iconCls:'icon-one-drive'">Save at OneDrive</div>
       </div>
     </div>
     <div data-options="iconCls:'icon-export-project'"><span>Import Project</span>
        <div>
          <div onclick="listDropboxProjects()"  data-options="iconCls:'icon-dropbox'">Import Project from Dropbox</div>
          <div onclick="listGithubProjects()"  data-options="iconCls:'icon-github'">Import Project from GitHub</div>
          <div onclick="listGoogleDriveProjects()" data-options="iconCls:'icon-google-drive'">Import Project from Google Drive</div>
          <div onclick="listOneDriveProjects()" data-options="iconCls:'icon-one-drive'">Import Project from OneDrive</div>
        </div>
     </div>
     <div data-options="iconCls:'icon-delete-file'"><span>Delete Project</span>
        <div>
          <div onclick="listDropboxProjects()"  data-options="iconCls:'icon-dropbox'">Delete Project from Dropbox</div>
          <div onclick="listGithubProjects()"  data-options="iconCls:'icon-github'">Delete Project from GitHub</div>
          <div onclick="listGoogleDriveProjects()" data-options="iconCls:'icon-google-drive'">Delete Project from Google Drive</div>
          <div onclick="listOneDriveProjects()" data-options="iconCls:'icon-one-drive'">Delete Project from OneDrive</div>
        </div>
     </div>
     <div class="menu-sep"></div>
     <div onclick="downloadProject()" data-options="iconCls:'icon-download-file'">Download Project</div>
     <div onclick="openUploadProject()"  data-options="iconCls:'icon-upload-file'">Upload Project</div>
     <div class="menu-sep"></div>
     <div onclick="openShareProject()" data-options="iconCls:'icon-share-project'">Share Project</div>
     <div class="menu-sep"></div>
     <div id="compileoptions" onclick="openCompileOptions()" data-options="iconCls:'icon-execute-project'">Compile Options</div>
</div>
</div><!--HEADER ENDS -->
<div id="south" data-options="region:'south', iconCls:'icon-terminal', split:true, tools:'#terminal-tools',title:'Terminal'" style="height:250px;"><!--FOOTER STARTS -->
      <div id="terminal" style="padding:0px; margin:0px;overflow:hidden;"></div>
</div><!--FOOTER ENDS -->
<div id="east" data-options="region:'east'" style="width:306px; border-left:5px solid #eee; overflow:hidden;"><!--TERMINAL STARTS -->
<div>
<script async src="//pagead2.googlesyndication.com/pagead/js/adsbygoogle.js"></script>
<!-- Coding Ground A -->
<ins class="adsbygoogle"
     style="display:inline-block;width:300px;height:250px"
     data-ad-client="ca-pub-7133395778201029"
     data-ad-slot="9395594521"></ins>
<script>
(adsbygoogle = window.adsbygoogle || []).push({});
</script>
</div>
<div>
<script async src="//pagead2.googlesyndication.com/pagead/js/adsbygoogle.js"></script>
<!-- Coding Ground A -->
<ins class="adsbygoogle"
     style="display:inline-block;width:300px;height:250px"
     data-ad-client="ca-pub-7133395778201029"
     data-ad-slot="9395594521"></ins>
<script>
(adsbygoogle = window.adsbygoogle || []).push({});
</script>
</div>
</div>
</div><!--TERMINAL ENDS -->
<div id="spectrum-tools" style="position:relative;">
  <input type='text' id="spectrum" />
</div>
<div id="terminal-tools" style="position:relative;">
   <a href="javascript:void(0);" onclick="setSpectrum()" class='icon-color'></a>
</div>
<div data-options="region:'west',onCollapse:doVertical, title:'Project',iconCls:'icon-project', split:true, tools: [{ iconCls:'icon-refresh-project', handler:function(){reloadTree()} },{ iconCls:'icon-add-file', handler:function(){newFile()} }]" style="width:250px;">
<ul id="home" class="easyui-tree" data-options="method:'GET', animate:true,lines:true">
<div id='treewait'>
<img style="margin-left:4px;margin-top:3px;width:28px; height:28px;" src='/images/loading.gif'/>
</div>
</ul>
</div>
<div data-options="region:'center'" style="padding:0px;background:#eee; border-right:2px solid #bfbfbf;"><!--CODE AREA STARTS -->
<div data-options="fit:true,border:false,tools:'#tab-tools',toolPosition:'left'" id="codebox" class="easyui-tabs" style="width:55%;">
</div>
<div id="tab-tools" style="border-top:0px; border-right:0px;">
<div id='wait' style='display:none'>
<img style="margin-left:4px;margin-top:3px;width:28px; height:28px;" src='/images/loading.gif'/>
</div>
<a href="javascript:void(0)" id="compile"  class="easyui-linkbutton" data-options="plain:true,iconCls:'icon-execute-project'" style="white-space:nowrap;"><b>Compile</b></a>
<a href="javascript:void(0)" id="preview"  class="easyui-linkbutton" data-options="plain:true,iconCls:'icon-execute-project'" style="white-space:nowrap;"><b>Preview</b></a>
<a href="javascript:void(0)" id="separator" class="easyui-linkbutton" data-options="plain:true" style="white-space:nowrap;"><b>|</b></a>
<a href="javascript:void(0)" id="execute"  class="easyui-linkbutton" data-options="plain:true" style="white-space:nowrap;"><b>Execute</b></a></div>
</div>
</div><!--CODE AREA STARTS -->
</body>
</html>

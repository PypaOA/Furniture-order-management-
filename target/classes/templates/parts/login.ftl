<#macro login path>
    <form style=" padding: 20px; border:1px solid black; width: max-content" action="${path}" method="post">
        <div style=" display: flex; justify-content: space-between;  align-items: center; margin-bottom: 6px; padding: 6px 0 ">
            <label for="name0" > User Name: </label>
            <input style=" margin-left: 20px; width: 150px; outline: none " type="text" name="username" id="name0"/>
        </div>
        <div style=" display: flex; justify-content: space-between;  align-items: center; margin-bottom: 6px; padding: 6px 0 ">
            <label for="name1" > Password: </label>
            <input style=" margin-left: 20px; width: 150px; outline: none " type="password" name="password" id="name1"/>
        </div>
        <input type="hidden" name="_csrf" value="${_csrf.token}" />
        <div><input type="submit" value="Sign In"/></div>
    </form>
</#macro>


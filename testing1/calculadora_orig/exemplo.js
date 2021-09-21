test('Resolver division', () =>{
    opera = '21'
    operb = '3'
    oper = "/"
    const ret = setVars(opera,operb,oper)
    const validateElement_2 = document.getElementById(id);
    expect(validateElement_2).toBeDefined();
    expect(validateElement_2.innerHTML).toBe("10");
    expect(ret[0]).toBe("21");
    expect(ret[1]).toBe("3");
    expect(ret[2]).toBe("/");
    resolver();
    const ret2 = setVars()
    expect(validateElement_2.innerHTML).toBe("7");
    expect(ret2[0]).toBe(0);
    expect(ret2[1]).toBe(0);
    expect(ret2[2]).toBe("");
    validateElement_2.innerHTML = value;
})